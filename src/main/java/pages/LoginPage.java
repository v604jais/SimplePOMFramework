package pages;

import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utills.JavaUtils;
import utills.Log;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	@FindBy(xpath = "//*[@id=\"nav-link-yourAccount\"]/span[1]")
	public WebElement signIn;

	@FindBy(id = "ap_email")
	private WebElement amazonEmail;

	@FindBy(id = "continue")
	public WebElement continueBtn;

	@FindBy(id = "ap_password")
	private WebElement passwordTxt;

	@FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")
	public WebElement categoryTab;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	public WebElement mobile;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[1]/span")
	public WebElement allMobile;

	@FindBy(xpath = "//*[@alt='Honor Play']")
	public WebElement honor;

	/*
	 * This method is used to login as different user
	 * 
	 */
	protected HashMap<String, String> lp;
	public void login(String loginVal) throws InterruptedException {
		lp = JavaUtils.readExcelData("LOGIN", loginVal);
		signIn.click();
		amazonEmail.sendKeys(lp.get("USERNAME") );
		continueBtn.click();
		passwordTxt.sendKeys(lp.get("PASSWORD"), Keys.ENTER);
	}
	public void login(String email, String password) throws InterruptedException {
		 
	//	Log.info("User is attempting to login!");
		signIn.click();
		amazonEmail.sendKeys(email);
		continueBtn.click();
		passwordTxt.sendKeys(password, Keys.ENTER);
	//	Log.info("User logged-In sucessfuly!");
	}


}
