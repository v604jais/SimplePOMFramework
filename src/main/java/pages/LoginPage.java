package pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testScripts.BaseTest;
import utills.JavaUtils;
import utills.Log;

public class LoginPage extends BasePage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	@FindBy(xpath = "//a/span")
	private WebElement needHelp;
 

	@FindAll(@FindBy(xpath = "//*[@alt='Honor Play']"))
	private List<WebElement> em;

	// @FindBy(id = "//*[@id=\"nav-link-yourAccount\"]/span[1]")
	@FindBy(xpath = "//*[text()='Hello, Sign in']")
	private WebElement signIn;

	@FindBy(id = "ap_email")
	private WebElement amazonEmail;

	@FindBy(id = "createAccountSubmit")
	private WebElement createAccountSubmit;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(id = "ap_password")
	private WebElement passwordTxt;

	@FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")
	private WebElement categoryTab;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	private WebElement mobile;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[1]/span")
	private WebElement allMobile;

	@FindBy(xpath = "//*[@alt='Honor Play']")
	private WebElement honor;

	@FindBy(xpath = "//*[text()='Category']")
	public WebElement category;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement search;

	/*
	 * This method is used to login as different user
	 * 
	 */
	protected HashMap<String, String> lp;

	public void login(String loginVal) throws InterruptedException {
		lp = JavaUtils.readExcelData("LOGIN", loginVal);
		signIn.click();
		String expected = driver.getTitle();
		assertPageTitle(expected, "Amazon Sign In");
		amazonEmail.sendKeys(lp.get("USERNAME"));
		continueBtn.click();
		passwordTxt.sendKeys(lp.get("PASSWORD"), Keys.ENTER);
	}

	/**
	 * 
	 * @param email
	 * @param password
	 * @throws InterruptedException
	 */

	public void login(String email, String password) throws InterruptedException {

		signIn.click();
		amazonEmail.sendKeys(email);
		continueBtn.click();
		passwordTxt.sendKeys(password, Keys.ENTER);

	}

	public void dummy() {
	 em.get(2).click();
		signIn.click();
		createAccountSubmit.click();
	}

	protected HashMap<String, String> hp;

	public void searchProduct(String loginVal) throws IOException, InterruptedException {
		hp = JavaUtils.readExcelData("Home", loginVal);
		System.out.println(hp);
		search.sendKeys(hp.get("PRODUCT"), Keys.ENTER);
		mouseHover(category);
		Thread.sleep(2000);
	}

}
