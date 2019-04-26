package testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;

public class AZOO2 extends BaseTest {
	
	
	@Test
	public void az001() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.login("AM_LG01");
		AddressPage ap = new AddressPage(driver);
		ap.addAddress("ADD_AD001");
		
 
		
		
	}

}
