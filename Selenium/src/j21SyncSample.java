import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class j21SyncSample {

	public static void main(String[] args) {
		// http://www.itgeared.com/demo/1506-ajax-loading.html
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		// String
		// pCompleted=driver.findElement(By.cssSelector("div#results")).getText();
		WebDriverWait wdw = new WebDriverWait(driver, 10);
		wdw.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}
