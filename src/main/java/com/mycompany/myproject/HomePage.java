package com.mycompany.myproject;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.settings.def.DebugSettings;
import org.apache.wicket.validation.validator.RangeValidator;

import java.util.ArrayList;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;
    private Model<String> mOrderingCompany = new Model<String>();
    private Model<String> mOrderingCompanyAddress = new Model<String>();
    private Model<String> mOrderingContactPersonName = new Model<String>();
    private ArrayList<ProductItem> productItemList = new ArrayList<ProductItem>();
    private int productItemListNumber=1;

    private Form form = new Form("form") {
        private static final long serialVersionUID = -1700095884500348972L;

        @Override
        protected void onSubmit() {
            PrintPage result = new PrintPage((HomePage) this.getParent());
            setResponsePage(result);
        }
    };

    public HomePage(final PageParameters parameters) {
        super(parameters);
        add(form);
        Button nextButton = new Button("nextButton") {
            private static final long serialVersionUID = 1L;

            public void onSubmit() {
            }
        };
        form.add(nextButton);

        // フォームにテキストフィールドを追加
        TextField field = new TextField<String>("orderingCompany", mOrderingCompany);
        field.setOutputMarkupId(true);
        form.add(field);//受注先会社名
        field = new TextField<String>("orderingCompanyAddress", mOrderingCompanyAddress);
        field.setOutputMarkupId(true);
        form.add(field);//住所
        field = new TextField<String>("orderingContactPersonName", mOrderingContactPersonName);
        field.setOutputMarkupId(true);
        form.add(field);//受注先担当者名

        //最初は項目が1つだけ
        productItemList.add(new ProductItem());
        //項目追加
        final AjaxLink<Void> productItemAddButton = new AjaxLink<Void>("productItemAddButton"){
            @Override
            public void onClick(AjaxRequestTarget target) {
                productItemList.add(new ProductItem());
                target.add(form);
            }
        };

        form.add(productItemAddButton);
        form.add(new FeedbackPanel("feedbackMessage"));
        ListView<ProductItem> productItemListView = new ListView<ProductItem>("productItemList", productItemList) {
            @Override
            protected void populateItem(ListItem<ProductItem> listItem) {
                ProductItem productItem = listItem.getModelObject();
                listItem.add(new TextField<String>("productItemName", new PropertyModel<String>(productItem, "productItemName")));
                listItem.add(new TextField<Integer>("quantity", new PropertyModel<Integer>(productItem, "quantity"))
                        .add(RangeValidator.minimum(0)));
                listItem.add(new TextField<Integer>("unitPrice", new PropertyModel<Integer>(productItem, "unitPrice"))
                        .add(RangeValidator.minimum(0)));
            }
        };
        productItemListView.setReuseItems(true);
        form.add(productItemListView);
    }

    public Model getMOrderingCompany() {
        return mOrderingCompany;
    }

    public Model getMOrderingCompanyAddress() {
        return mOrderingCompanyAddress;
    }

    public Model getMOrderingContactPersonName() {
        return mOrderingContactPersonName;
    }

    public ArrayList<ProductItem> getProductItemList() {
        return productItemList;
    }
}
