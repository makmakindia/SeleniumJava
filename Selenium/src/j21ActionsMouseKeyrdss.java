import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Actions Class 
// Used to handle Mouse and Keyboard actions Double click , Mouse  Hower and drag & drop  actions 
public class j21ActionsMouseKeyrdss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		WebElement move = driver
				.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]"));

		// Send text in caps
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").build().perform();
		// Mouse however to specified element and right clicks
		a.moveToElement(move).contextClick().build().perform();

	}

}
