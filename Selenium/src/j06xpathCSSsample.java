import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j06xpathCSSsample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		// //tagname[@attribute='value'] -- xpath locator syntax
		// <input name="username123"/>

		// tagname[@contains(@attribute,'value')] -- xpath regEx
		/*
		 * d.get("https://www.facebook.com/");
		 * 
		 * d.findElement(By.xpath("//*[@id='email']")).sendKeys("Xpath to facebook");
		 * d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password xpath");
		 * d.findElement(By.xpath("//input[@value='Log In']")).click();
		 * 
		 * 
		 * // 1. tagname[attribute='value'] - CSS locator
		 * 
		 * // 2. tagname#attributevalue
		 *
		 * // 3. tagname#classname
		 * 
		 * // 4. tagname[attribute*='Value '] -- CSS regular expression
		 * d.findElement(By.cssSelector("input[name='email']")).
		 * sendKeys("css loca for email"); System.out.println(d.getTitle());
		 * d.findElement(By.cssSelector("input#pass")).sendKeys("CSS locator ");
		 * d.findElement(By.cssSelector("input[value='Log In']")).click();
		 * 
		 * 
		 * 
		 * d.get("https://login.salesforce.com/?locale=in");
		 * //d.get("https://www.salesforce.com");
		 * d.findElement(By.cssSelector("a[data-toggle='dropdown']")).click();
		 * d.findElement(By.cssSelector("input[id='username']")).sendKeys("css locator"
		 * );
		 * d.findElement(By.cssSelector("input[name='pw']")).sendKeys("Css Password ");
		 */

		d.get("https://www.rediff.com");
		d.findElement(By.cssSelector("a[title*='Sign in'")).click();
		d.findElement(By.xpath("//input[@name='login']")).sendKeys("xpath loc");
		d.findElement(By.cssSelector("input#password")).sendKeys("Pass CSS loc");
		d.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		// d.findElement(By.cssSelector("input[value='Go']")).click();
		System.out.println(d.getTitle());
		d.quit();
	}

}
