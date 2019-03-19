import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class j01Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		

		//
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='topcat1']")).click();
		//driver.findElement(By.xpath("//*[text()='Men Lifestyle']")).click();
		// org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //*[text()='Men's Lifestyle'] because of the following error:
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
