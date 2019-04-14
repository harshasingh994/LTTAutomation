package com.LTT.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LTT.qa.Pages.HomePage;
import com.LTT.qa.Pages.PickUpDatePage;
import com.LTT.qa.TestBase.TestBase;

public class PickUpDateTest extends TestBase {
	PickUpDatePage pickUpDatePage;
	HomePage homePage;

	public PickUpDateTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialisation();

		homePage = new HomePage();
		pickUpDatePage = homePage.navigateToMovie("The Simon and Garfunkel Story");
		pickUpDatePage = new PickUpDatePage();
		
	}

	@Test
	public void validate_pageTitle_Test() throws InterruptedException {
		String title = pickUpDatePage.PageTitle();
		Assert.assertEquals(title, "Book London Theater Tickets | Get Exclusive Deals & Offers");

	}

	@Test
	public void validate_availabledate_Test() throws InterruptedException {
		// Thread.sleep(10000);
		pickUpDatePage.availabledatecheck();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}