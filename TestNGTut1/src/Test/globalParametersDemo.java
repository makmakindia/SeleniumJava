package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class globalParametersDemo {
	
	WebDriver driver;
	@Test
	public void WebLogin() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ARUNM\\Selenium_udemy\\TestNGTut1\\src\\dataDriven.properties");
		
		prop.load(fis);
		
		System.out.println("User Name : "+prop.getProperty("username"));
		System.out.println("Password : "+prop.getProperty("password"));
		System.out.println("URL : "+prop.getProperty("url"));
		System.out.println("BrowserName : "+prop.getProperty("browserName"));
		
		
		if(prop.getProperty("browserName").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else if(prop.getProperty("browserName").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\work\\Selenium\\Drivers\\geckodriver.exe");
			driver =  new FirefoxDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println("Page Title : "+driver.getTitle());
		driver.quit();
		
		
	}



}
