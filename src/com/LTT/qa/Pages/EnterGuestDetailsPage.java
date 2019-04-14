package com.LTT.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LTT.qa.TestBase.TestBase;
import com.LTT.qa.Util.TestUtil;

public class EnterGuestDetailsPage extends TestBase {
	@FindBy(name = "First Name")
	WebElement firstName;
	@FindBy(name = "Last Name")
	WebElement lastName;
	@FindBy(name = "Email")
	WebElement Email;
	@FindBy(name = "Confirm Email")
	WebElement cemail;
	@FindBy(name = "Phone")
	WebElement ph;
	@FindBy(name = "Card Number")
	WebElement card;
	@FindBy(name = "Expiry (MM/YY)")
	WebElement expiry;
	@FindBy(name = "CVV")
	WebElement CVV;
	@FindBy(name = "Card Holder Name")
	WebElement chName;
	@FindBy(xpath = "//*[@class ='product-checkout-book-button-wrapper']/child::*")
	WebElement bookingButton;

	public EnterGuestDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserDetails(String fName, String lName, String email, String cmail, String cd, String exp,
			String cvv, String phone, String chname) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		Email.sendKeys(email);
		cemail.sendKeys(cmail);
		ph.sendKeys(phone);
		card.sendKeys(cd);
		expiry.sendKeys(exp);
		CVV.sendKeys(cvv);
		chName.sendKeys(chname);
		bookingButton.click();
	}
}
