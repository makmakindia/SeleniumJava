import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class j02fireFoxDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\work\\Selenium\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		// driver.quit();

	}

}
