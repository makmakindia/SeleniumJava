import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j09CalenderPlickers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.path2usa.com/travel-companions
		// 1. pick the date and month of calender picker 
		// 2. 23 April 
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		//System.out.println(driver.findElements(By.className("day")).size());
		// driver.findElement(By.xpath("//td[@class='day']")).click();
		
		/// [class='datepicker-days'] [class='datepicker-switch']
		//System.out.println(driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getSize());
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("January")){
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		List<WebElement> Datelist=driver.findElements(By.className("day"));
		
		int count=driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
				
			}
		}
		
	//	driver.quit();
		
	}

}
