package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;

import org.ini4j.InvalidFileFormatException;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductPage  {

	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		 
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//*[text() ='Apple iPhone 7 (Black, 2GB RAM, 32GB Storage)']")
	public WebElement iphone7;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	public WebElement mobile;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[1]/span")
	public WebElement allMobile;

	@FindBy(linkText = "Honor Play")
	public WebElement honorPlay;

 

	public void productDiscription() throws IOException, InterruptedException {
	 
		iphone7.click();
	//	search.sendKeys(pdp.get("PRODUCTNAME"), Keys.ENTER);
	 
	}
 
	
	
	

}



