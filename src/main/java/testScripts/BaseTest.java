package testScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
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

			// driver.get("https://www.amazon.in/");
			driver.navigate().to("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	// @AfterSuite
	@AfterClass

	public void closeBroswer() {
		driver.quit();

	}

	

}
