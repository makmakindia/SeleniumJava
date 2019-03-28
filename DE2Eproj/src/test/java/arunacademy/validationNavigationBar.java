package arunacademy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;

public class validationNavigationBar extends Base {
	private static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initilizeDriver();
		driver.get(prop.getProperty("URL"));
	}
	@Test
	public void validatePageNAvigationBar() throws IOException {
		

		LandingPage l=new LandingPage(driver);
		
		
		Assert.assertTrue(l.getnavbar().isDisplayed());
		log.info("Successfully verified Navigational bar exists");
	}
	
@AfterTest
public void teardown() {
	driver.close();
	driver=null;
}

}
