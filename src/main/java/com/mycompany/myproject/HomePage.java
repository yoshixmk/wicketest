package com.mycompany.myproject;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	private Model mOrderingCompany = new Model();
	private Model mOrderingCompanyAddress = new Model();
	private Model mOrderingContactPersonName = new Model();
	private Model mProductItem1 = new Model();
	private Model mProductItem2 = new Model();
	private Model mProductItem3 = new Model();
	private Model mProductItem4 = new Model();
	private Model mProductItem5 = new Model();
	private Model mQuantity1 = new Model();
	private Model mQuantity2 = new Model();
	private Model mQuantity3 = new Model();
	private Model mQuantity4 = new Model();
	private Model mQuantity5 = new Model();
	private Model mUnitPrice1 = new Model();
	private Model mUnitPrice2 = new Model();
	private Model mUnitPrice3 = new Model();
	private Model mUnitPrice4 = new Model();
	private Model mUnitPrice5 = new Model();
	private Model mAmountOfMoney1 = new Model();
	private Model mAmountOfMoney2 = new Model();
	private Model mAmountOfMoney3 = new Model();
	private Model mAmountOfMoney4 = new Model();
	private Model mAmountOfMoney5 = new Model();
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
//				PrintPage resultPrintPage = new PrintPage((HomePage) this.getParent());
//				setResponsePage(resultPrintPage);
//				setResponsePage((HomePage) this.getParent());
			}
		};
		form.add(nextButton);
//		super.add(form);

		// ここから追加分

		// フォームにテキストフィールドを追加
		TextField field = new TextField("orderingCompany", mOrderingCompany);
		field.setOutputMarkupId(true);
		form.add(field);//受注先会社名
		field = new TextField("orderingCompanyAddress", mOrderingCompanyAddress);
		field.setOutputMarkupId(true);
		form.add(field);//住所
		field = new TextField("orderingContactPersonName", mOrderingContactPersonName);
		field.setOutputMarkupId(true);
		form.add(field);//受注先担当者名
		field = new TextField("productItem1", mProductItem1);
		field.setOutputMarkupId(true);
		form.add(field);//項目
		field = new TextField("productItem2", mProductItem2);
		field.setOutputMarkupId(true);
		form.add(field);//項目
		field = new TextField("productItem3", mProductItem3);
		field.setOutputMarkupId(true);
		form.add(field);//項目
		field = new TextField("productItem4", mProductItem4);
		field.setOutputMarkupId(true);
		form.add(field);//項目
		field = new TextField("productItem5", mProductItem5);
		field.setOutputMarkupId(true);
		form.add(field);//項目
		field = new TextField("quantity1", mQuantity1);
		field.setOutputMarkupId(true);
		form.add(field);//数量
		field = new TextField("quantity2", mQuantity2);
		field.setOutputMarkupId(true);
		form.add(field);//数量
		field = new TextField("quantity3", mQuantity3);
		field.setOutputMarkupId(true);
		form.add(field);//数量
		field = new TextField("quantity4", mQuantity4);
		field.setOutputMarkupId(true);
		form.add(field);//数量
		field = new TextField("quantity5", mQuantity5);
		field.setOutputMarkupId(true);
		form.add(field);//数量
		field = new TextField("unitPrice1", mUnitPrice1);
		field.setOutputMarkupId(true);
		form.add(field);//単価
		field = new TextField("unitPrice2", mUnitPrice2);
		field.setOutputMarkupId(true);
		form.add(field);//単価
		field = new TextField("unitPrice3", mUnitPrice3);
		field.setOutputMarkupId(true);
		form.add(field);//単価
		field = new TextField("unitPrice4", mUnitPrice4);
		field.setOutputMarkupId(true);
		form.add(field);//単価
		field = new TextField("unitPrice5", mUnitPrice5);
		field.setOutputMarkupId(true);
		form.add(field);//単価
		field = new TextField("amountOfMoney1", mAmountOfMoney1);
		field.setOutputMarkupId(true);
		form.add(field);//金額
		field = new TextField("amountOfMoney2", mAmountOfMoney2);
		field.setOutputMarkupId(true);
		form.add(field);//金額
		field = new TextField("amountOfMoney3", mAmountOfMoney3);
		field.setOutputMarkupId(true);
		form.add(field);//金額
		field = new TextField("amountOfMoney4", mAmountOfMoney4);
		field.setOutputMarkupId(true);
		form.add(field);//金額
		field = new TextField("amountOfMoney5", mAmountOfMoney5);
		field.setOutputMarkupId(true);
		form.add(field);//金額


		// TODO Add your page's components here

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
	public Model getMProductItem1() {
		return mProductItem1;
	}
	public Model getMProductItem2() {
		return mProductItem2;
	}
	public Model getMProductItem3() {
		return mProductItem3;
	}
	public Model getMProductItem4() {
		return mProductItem4;
	}
	public Model getMProductItem5() {
		return mProductItem5;
	}
	public Model getMQuantity1() {
		return mQuantity1;
	}
	public Model getMQuantity2() {
		return mQuantity2;
	}
	public Model getMQuantity3() {
		return mQuantity3;
	}
	public Model getMQuantity4() {
		return mQuantity4;
	}
	public Model getMQuantity5() {
		return mQuantity5;
	}
	public Model getMUnitPrice1() {
		return mUnitPrice1;
	}
	public Model getMUnitPrice2() {
		return mUnitPrice2;
	}
	public Model getMUnitPrice3() {
		return mUnitPrice3;
	}
	public Model getMUnitPrice4() {
		return mUnitPrice4;
	}
	public Model getMUnitPrice5() {
		return mUnitPrice5;
	}
	public Model getMAmountOfMoney1() {
		return mAmountOfMoney1;
	}
	public Model getMAmountOfMoney2() {
		return mAmountOfMoney2;
	}
	public Model getMAmountOfMoney3() {
		return mAmountOfMoney3;
	}
	public Model getMAmountOfMoney4() {
		return mAmountOfMoney4;
	}
	public Model getMAmountOfMoney5() {
		return mAmountOfMoney5;
	}
}

/*
package com.mycompany.myproject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {

	private static final long serialVersionUID = 3598788934381254916L;

	private Form form = new Form("f") {
		private static final long serialVersionUID = -1700095884500348972L;

		@Override
		protected void onSubmit() {
			PrintPage result = new PrintPage((HomePage) this.getParent());
			setResponsePage(result);
		}
	};

	private Model mSubject = new Model();

	private Model mType = new Model();

	private Model mDate = new Model(new Date());

	private Model mArticle = new Model();

	private FeedbackPanel feedback = new FeedbackPanel("msg");

	public HomePage(final PageParameters parameters) {

		add(feedback);

		add(form);

		TextField txtSubject = new TextField("subject", mSubject);
		txtSubject.setRequired(true);
		form.add(txtSubject);

		List<String> typeList = new ArrayList<String>();
		typeList.add("Diary");
		typeList.add("Book Review");
		typeList.add("Tech Memo");
		typeList.add("Diet");
		// If you want to set the Default Value of combo box,
		// write like following.
		//mType.setObject("Diary");
		DropDownChoice cmbType =new DropDownChoice("type", mType, typeList);
		cmbType.setRequired(true);
		form.add(cmbType);

		TextField txtDate = new TextField("date", mDate,Date.class);
		txtDate.setRequired(true);
		form.add(txtDate);

		TextArea txtArticle = new TextArea("article", mArticle);
		txtArticle.setRequired(true);
		form.add(txtArticle);
	}

	public Model getMSubject() {
		return mSubject;
	}

	public Model getMType() {
		return mType;
	}

	public Model getMDate() {
		return mDate;
	}

	public Model getMArticle() {
		return mArticle;
	}
}

*/