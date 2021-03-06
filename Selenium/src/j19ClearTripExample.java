import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j19ClearTripExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		// Selected Adults value as 9
		Select sAdults = new Select(driver.findElement(By.id("Adults")));
		sAdults.selectByValue("7");
		// selects number of childrens
		Select sChildren = new Select(driver.findElement(By.id("Childrens")));
		sChildren.selectByValue("2");
		// selects number of infant
		Select sInfants = new Select(driver.findElement(By.id("Infants")));
		sInfants.selectByIndex(2);
		// choose current date
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"))
				.click();
		// driver.findElement(By.xpath("//a[contains(@class,'ui-state-default
		// ui-state-highlight ui-state-active')]")).click();
		// click on more options
		driver.findElement(By.xpath("//*[@id='MoreOptionsLink']/strong/i")).click();
		// seelct class of travel value
		Select sEconomy = new Select(driver.findElement(By.xpath("//select[@id='Class']")));
		sEconomy.selectByVisibleText("Business");
		// select prefered Airlines
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("IndiGo (6E)");
		driver.findElement(By.id("SearchBtn")).click();
		// capture message displayed incase of error
		String str1 = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println("ERROR MSG : " + str1);
		driver.quit();
	}

}
