package arunacademy;
import java.io.IOException;


import PageObjects.LandingPage;
import PageObjects.LoginPage;

import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HomePage extends Base {
	private static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void Initialize() throws IOException {
		driver=initilizeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String Password, String text) throws IOException {
		
		driver.get(prop.getProperty("URL"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(Password);
		log.info(text);
		
		//driver.quit();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] obj=new Object[2][3];
		
		obj[0][0]="abc@abc.com";
		obj[0][1]="Passcode";
		obj[0][2]="RestrictedUser";
		
		obj[1][0]="def@abc.com";
		obj[1][1]="Passcode1";
		obj[1][2]="Non RestrictedUser";
		
		return obj;
		
	}

}
