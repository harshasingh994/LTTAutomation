package com.LTT.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.LTT.qa.Pages.EnterGuestDetailsPage;
import com.LTT.qa.Pages.HomePage;
import com.LTT.qa.Pages.PickUpDatePage;
import com.LTT.qa.Pages.SeatSelectionPage;
import com.LTT.qa.TestBase.TestBase;
import com.LTT.qa.Util.TestUtil;

public class EnterGuestDetailsTest extends TestBase {
	String sheetName = "TestData";
	PickUpDatePage pickUpDatePage;
	HomePage homePage;
	SeatSelectionPage selectseat;
	EnterGuestDetailsPage userDetails;

	public EnterGuestDetailsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialisation();
		homePage = new HomePage();
		pickUpDatePage = homePage.navigateToMovie("The Simon and Garfunkel Story");
		pickUpDatePage = new PickUpDatePage();
		selectseat = new SeatSelectionPage();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void validateEnteringUserDetails(String firstname, String lastname, String email, String confirmemail,
			String phone, String card, String expiry, String cvv, String chname) {
		userDetails.enterUserDetails(firstname, lastname, email, confirmemail, phone, card, expiry, cvv, chname);
    }

	@Test
	public void enterUserDetails() {

	}
}
