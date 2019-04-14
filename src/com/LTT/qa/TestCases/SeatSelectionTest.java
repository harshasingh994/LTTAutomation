package com.LTT.qa.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.LTT.qa.Pages.HomePage;
import com.LTT.qa.Pages.PickUpDatePage;
import com.LTT.qa.Pages.SeatSelectionPage;
import com.LTT.qa.TestBase.TestBase;

public class SeatSelectionTest extends TestBase {
	PickUpDatePage pickUpDatePage;
	HomePage homePage;
	SeatSelectionPage selectseat;

	public SeatSelectionTest() {
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

	@Test
	public void selectSeatTest() {
    selectseat.seatselect();
	}
}
