package pages;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utills.JavaUtils;

public class HomePage extends BasePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		 super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	/**
	 * @author aravindanathdm
	 */

	@FindBy(id = "twotabsearchtextbox")
	public WebElement search;

	@FindBy(xpath = "//*[@id=\"nav-link-shopall\"]/span[2]")
	public WebElement categoryTab;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	public WebElement mobile;

	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[1]/div/a[1]/span")
	public WebElement allMobile;

	@FindBy(linkText = "Honor Play")
	public WebElement honorPlay;

	@FindBy(xpath = "//*[text()='Category']")
	public WebElement category;

	protected HashMap<String, String> hp;

	public void searchProduct(String loginVal) throws IOException, InterruptedException {
		hp = JavaUtils.readExcelData("Home", loginVal);
		System.out.println(hp);
		search.sendKeys(hp.get("PRODUCT"), Keys.ENTER);
		mouseHover(category);
		Thread.sleep(2000);
	}

}
