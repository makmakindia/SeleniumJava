
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j04locsFacebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.name("email")).sendKeys("Hello Tiffin");
		 * //driver.quit();
		 * 
		 */

		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//*[@id='email']")).sendKeys("DSFFSDFSDFSD");
		d.findElement(By.xpath("//*[@id='pass']")).sendKeys("RESETPASS");
		d.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a"))
				.click();
		d.findElement(By.id("did_submit")).click();
		System.out.println(d.getTitle());
		// form[@id='identify_yourself_flow']/div/div[2]/div/div[2]
		// String s1= d.findElement(By.cssSelector("pam > div:nth-child(2)")).getText();
		/// By.xpath("//form[@id='identify_yourself_flow']/div/div[2]/div/div[2]")).getText();

		// System.out.println("Arun : "+s1);
		// System.out.println(
		// d.findElement(By.xpath("//form[@id='identify_yourself_flow']/div/div[2]/div/div[2]")).getText());
		d.quit();
	}

}
