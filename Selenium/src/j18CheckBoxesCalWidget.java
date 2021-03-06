import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class j18CheckBoxesCalWidget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click(); // check box is Checked
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click();// check box is UnChecked
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		int cnt = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("Total Checkboxes : " + cnt);

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		// Selenium is not able to identify its disabled
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It is enabled :  " + driver.findElement(By.id("Div1")).getAttribute("style"));
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		// driver.quit();

	}

}
