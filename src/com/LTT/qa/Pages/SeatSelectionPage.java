package com.LTT.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LTT.qa.TestBase.TestBase;

public class SeatSelectionPage extends TestBase {
@FindBy(xpath= "<circle code=\"seat-15\" cx=\"441.16\" cy=\"646.17\" r=\"8.0\" display=\"15\" class=\"seat bookable selected\" bookable=\"true\" id=\"SE-DRESSCIRCLE-D-15\" max-available=\"1\" style=\"opacity: 1; fill: rgb(255, 255, 255);\" fill=\"#68cb5c\" price=\"72\" remaining=\"1\" currency=\"£\"></circle>")
WebElement seat;

public SeatSelectionPage() {
	PageFactory.initElements(driver, this);
}
public EnterGuestDetailsPage seatselect() {
	Actions ac = new Actions(driver);
	ac.moveToElement(seat).build().perform();
	seat.click();
	return new EnterGuestDetailsPage();
	
}



}
