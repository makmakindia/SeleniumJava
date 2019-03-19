import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j07staticDropdwonVals {

	public static void main(String[] args) {
		// http://demo.guru99.com/test/newtours/reservation.php
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/newtours/reservation.php");

		Select s1 = new Select(d.findElement(By.xpath("//select[@name='passCount']")));
		s1.selectByValue("4");
		s1.selectByIndex(2);
		d.quit();

	}

}
