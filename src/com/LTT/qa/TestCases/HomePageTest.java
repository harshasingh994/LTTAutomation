package com.LTT.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LTT.qa.Pages.HomePage;
import com.LTT.qa.Pages.PickUpDatePage;
import com.LTT.qa.TestBase.TestBase;

public class HomePageTest extends TestBase {

	HomePage homePage;
	PickUpDatePage pickUpDate;

	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialisation();
		homePage = new HomePage();
	}
	@Test
	public void LTTlogoTest() {
		boolean logo= homePage.homePageLogo();
		Assert.assertTrue(logo);
	}
	@Test
	public void moviePageTest() throws InterruptedException {
		 pickUpDate = homePage.navigateToMovie("The Simon and Garfunkel Story");
        
       
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
