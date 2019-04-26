package pages;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utills.JavaUtils;

public class AddressPage  extends BasePage{
	private WebDriver driver;
	
	public AddressPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	
	@FindBy(xpath="//*[@id=\"nav-link-yourAccount\"]")
	private WebElement order;
	
	@FindBy(xpath="//*[@type='submit' and @class='a-button-input']")
	private WebElement submitBtn;
	
	@FindBy(linkText="Your Account")
	private WebElement yourAccount;
	
	@FindBy(xpath="//*[@id='a-page']/div[2]/div/div[3]/div[1]/a/div/div")
	private WebElement yourAddress;
	
	@FindBy(xpath="//*[@id='ya-myab-address-add-link']/div")
	private WebElement addAddressButton;
	
	@FindBy(xpath="//*[@id='address-ui-widgets-countryCode']/span/span")
	private WebElement countryDropDown;
	
	
	@FindBy(xpath="//*[@id='address-ui-widgets-enterAddressFullName']")
	private WebElement fullname;
	
	@FindBy(xpath="//*[@id='address-ui-widgets-enterAddressStateOrRegion']/span/span")
	private WebElement state;
	
	
	
	
	protected HashMap<String, String> address;
	
	
	
	public void addAddress(String addressVal) throws InterruptedException {
										// Sheetname , WorkFlowID
		address = JavaUtils.readExcelData("Address", addressVal);
		
		mouseHover(order);
		Thread.sleep(2000);
		yourAccount.click();
		Thread.sleep(2000);
		yourAddress.click();
		Thread.sleep(2000);
		addAddressButton.click();
		Thread.sleep(2000);
		fullname.sendKeys(address.get("FullName"));
		state.sendKeys(address.get("State"));
		submitBtn.click();
		assertPageTitle("Amaxib", "asdasdf");
		
		
	}
	
	
	 
	
	
}
