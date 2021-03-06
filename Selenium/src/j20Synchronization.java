import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class j20Synchronization {

	public static void main(String[] args) throws InterruptedException {

		/* Implicit Wait Explicit Wait Thread.sleep Fluent Wait */
		// https://alaskatrips.poweredbygps.com

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * //how to make it work using implicit wait
		 */
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.cssSelector("#FH-origin")).sendKeys("New York (NYC-All Airports)");
		// driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#FH-destination")).sendKeys("Anchorage, Alaska");
		// driver.findElement(By.cssSelector("#package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#FH-fromDate")).click();
		driver.findElement(By.xpath(
				"//div[contains(@class,'oneWayOrReturn ignore-hidden-fields')]//div[2]//table[1]//tbody[1]//tr[3]//td[6]//button[1]"))
				.click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Synchronization ERROR
		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate
		// element: {"method":"xpath","selector":"//article[contains

		WebDriverWait dWait = new WebDriverWait(driver, 10);
		// dWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[contains(@class,'hotel
		// listing col organic urgencyMsg available organic
		// h-5722-organic')]//a[contains(@class,'flex-link')]")));
		dWait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//article[contains(@class,'hotel listing col organic urgencyMsg available organic h-5722-organic')]//a[contains(@class,'flex-link')]")));

		driver.findElement(By.xpath(
				"//article[contains(@class,'hotel listing col organic urgencyMsg available organic h-5722-organic')]//a[contains(@class,'flex-link')]"))
				.click();
		driver.quit();
	}

}
