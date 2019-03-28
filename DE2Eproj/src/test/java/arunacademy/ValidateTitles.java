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


public class ValidateTitles extends Base {
	private static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initilizeDriver();
		log.info("Drive initialied ");
		driver.get(prop.getProperty("URL"));
		log.info("Browsing Base URL  ");
	}
	@Test
	public void validatePageCourseTitle() throws IOException {
		

		LandingPage l=new LandingPage(driver);
		
		
		
		Assert.assertEquals(l.getTitleText().getText(),"FEATURED COURSES1");
		log.info("Succesfully validated FEATURED COURSES title in the webpage ");
	}
	
@AfterTest
public void teardown() {
	driver.close();
	driver=null;
}

}
