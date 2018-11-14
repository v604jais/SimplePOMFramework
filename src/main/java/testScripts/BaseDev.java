package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.*;

public class BaseDev {
	protected WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		String browser = "Chrome";

		if (browser.equals("FireFox")) {

			System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,
					"/Users/aravindanathdm/Documents/Aravinda/geckodriver");

			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
					"/Users/aravindanathdm/eclipse-workspace/AutomationFrameworks/Output/firefox.log");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");

		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/Aravinda/chromedriver");
			ChromeOptions ops = new ChromeOptions();
			ops.setAcceptInsecureCerts(true);
			ops.addArguments("--disable-notifications");
			ops.addArguments("disable-infobars");
			ops.addArguments("start-maximized");
			driver = new ChromeDriver(ops);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
		}
	}

	 
	
	
	
	@AfterSuite
	@AfterTest
	public void closeBroswer() {
		driver.close();
		driver.quit();
		;
	}
}
