package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class AZ001 extends BaseTest {
	
	
	@Test
	public void az001() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.login("AM_LG01");
	 
		HomePage hp = new HomePage(driver);
		hp.searchProduct("AM_HP01");
		
		
	}

}
