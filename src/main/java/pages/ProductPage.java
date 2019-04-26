package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.ini4j.InvalidFileFormatException;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ProductPage extends BasePage {

	private WebDriver driver;
	public ProductPage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
//Apple iPhone 7 (32GB) - Black
	@FindBy(xpath = "//*[text() ='Apple iPhone 7 (Black, 2GB RAM, 32GB Storage)']")
	public WebElement iphone7;
	
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	public WebElement addCart;
	
	@FindAll(@FindBy(xpath="//*[contains(text(),'Apple iPhone')]"))
	List<WebElement> iphones;

	@FindAll(@FindBy(xpath="//*[contains(text(),'Add to Basket')]"))
	List<WebElement> addBaseket;
	
	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	public WebElement mobile;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[1]/span")
	public WebElement allMobile;

	@FindBy(linkText = "Honor Play")
	public WebElement honorPlay;

 

	public void productDiscription() throws IOException, InterruptedException {
	 
		iphones.get(2).click();
		addCart.click();
	//	search.sendKeys(pdp.get("PRODUCTNAME"), Keys.ENTER);
	 
	}
 
	
	
	

}



