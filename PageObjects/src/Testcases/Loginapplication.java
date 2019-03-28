package Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectReporsitory.RediffHomepage;
//import ObjectReporsitory.RediffLoginpage;
import ObjectReporsitory.RediffLoginpagePF;

public class Loginapplication {

	
	@Test
	public void Login() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\246\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	//	WebDriverManager.chromedriver().version("2.46").setup();
		
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//RediffLoginpage rlogin=new RediffLoginpage(driver);
		driver.manage().window().maximize();
		
		RediffLoginpagePF rlogin=new RediffLoginpagePF(driver);
		RediffHomepage rHome=new RediffHomepage(driver);
		
		
		
/*		rlogin.emailId().sendKeys("Testusername");
		rlogin.Password().sendKeys("Passwordtest");
		rlogin.Seubmit().click();
		rlogin.HomeLink().click();*/
		
		rlogin.emailId().sendKeys("Testusername");
		rlogin.Password().sendKeys("Passwordtest");
		rlogin.Seubmit().click();
		rlogin.HomeLink().click();
		
		
		System.out.println(driver.getTitle());
		
		rHome.searchTxt().sendKeys("Toys");
		rHome.searchTxt().sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}


}
