import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class j03ieDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "D:\\work\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		/*
		 * driver.get("https://google.com"); System.out.println(driver.getTitle());
		 * driver.quit();
		 */
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.id("email")).sendKeys("Hello Sailaja");
		 * System.out.println(driver.getTitle());
		 */

		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//*[@id=username]")).sendKeys("Test123");

		driver.quit();

	}

}
