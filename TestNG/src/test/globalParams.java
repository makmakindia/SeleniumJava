package test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class globalParams {
	
	WebDriver driver=null;
	
	
	@Test
	public void OpenBrowser() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ARUNM\\Selenium_udemy\\TestNG\\src\\test\\dataDriven.properties");
		prop.load(fis);
		
		if(prop.getProperty("BrowserName").equals("chrome")){
			
			driver = new ChromeDriver();
			
		}
		else if(prop.getProperty("BrowserName").equals("firefox")){
			System.setProperty("webdriver.gecko.driver","D:\\work\\Selenium\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(prop.getProperty("BrowserName").equals("IE")){
			
			System.setProperty("webdriver.ie.driver", "D:\\work\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Provide Driver Information.....");
		}
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.quit();
//		System.out.println("User Name :: "+prop.getProperty("USERNAME"));
//		System.out.println("User Password :: "+prop.getProperty("PASSWORD"));
//		System.out.println("User URL :: "+prop.getProperty("URL"));
		
	}

}
