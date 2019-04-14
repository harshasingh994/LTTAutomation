package com.LTT.qa.Pages;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LTT.qa.TestBase.TestBase;
import com.LTT.qa.TestCases.SeatSelectionPage;

public class PickUpDatePage extends TestBase {
	//// *[@class='product-name']
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[30]")
		// "//*[@id='app']// span[contains(text(),'29')]")
	WebElement movieDate;

//date-picker-big
	@FindBy(xpath = "//*[@class ='date-picker-big']")
	WebElement datepicker;

	public PickUpDatePage() {
		PageFactory.initElements(driver, this);
	}

	public String PageTitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title;").toString();

	}

	public SeatSelectionPage availabledatecheck() {
		 //JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        //String date1= js1.executeScript("arguments[0].getText();", movieDate).toString();
		 //List<WebElement> udate=driver.findElements(By.xpath("//*[@class ='date-big-wrapper unavailable  ']")) ;
		/// for(WebElement ele:udate)
			//{
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", movieDate);
        return new SeatSelectionPage();
	}
}