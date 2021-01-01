package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class DetailsPage extends LibGlobal {
	
	public DetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtCardnumber;

	@FindBy(id = "cc_type")
	private WebElement dDnCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement dDnMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement dDnyear;

	@FindBy(id = "cc_cvv")
	private WebElement txtcvv;

	@FindBy(id = "book_now")
	private WebElement btnbook;

	

	public void details(String firstName, String lastName, String address, String cNumber, String cType, String mnth,
			String yr, String cvvnum) {

		type(txtFirstName, firstName);

		type(txtLastName, lastName);

		type(txtAddress, address);

		type(txtCardnumber, cNumber);

		selectbyVisibletext(dDnCardType, cType);

		selectbyVisibletext(dDnMonth, mnth);

		selectbyVisibletext(dDnyear, yr);

		type(txtcvv, cvvnum);

	}

}
