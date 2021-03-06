import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j22MultWindowsSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		driver.findElement(By.cssSelector("a[href*='accounts.google']")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it=ids.iterator();
		
		String pWinID=it.next();
		String cWinID=it.next();
		
		System.out.println("Parent : "+pWinID+" Child : "+cWinID);
		
		driver.switchTo().window(cWinID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(pWinID);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
