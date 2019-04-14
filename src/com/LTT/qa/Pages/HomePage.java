package com.LTT.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.LTT.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//*[@class ='mobi-logo']")
	  WebElement LTTLogo;
	@FindBy(id="search-form")
	  WebElement search;
    @FindBy(xpath = "//input[@type = 'text']")
      WebElement searchBar;
    ////*[@class ='button'],Book Now
    @FindBy(xpath="//*[@class ='button']")
      WebElement bookNowButton;
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    public boolean homePageLogo() {
    	return LTTLogo.isDisplayed();
    }
    public PickUpDatePage navigateToMovie(String movie) {
    	searchBar.sendKeys(movie);
    	searchBar.sendKeys(Keys.ENTER);
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", bookNowButton);
		 return new PickUpDatePage();
    }
}