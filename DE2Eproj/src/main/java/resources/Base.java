package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initilizeDriver() throws IOException {
		
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ARUNM\\Selenium_udemy\\DE2Eproj\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			//System.setProperty("", "") D:\work\Selenium\Drivers\2.37\chromedriver.exe
			//System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\2.37\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\work\\Selenium\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.ie.driver", "D:\\work\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
			 driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	public void takeScreenShot(String TestCaseName) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src,new File());
		FileUtils.copyFile(src, new File("C:\\Users\\ARUNM\\Selenium_udemy\\DE2Eproj\\screensFailures\\"+TestCaseName+"_screenshot.png"));

	}

}
