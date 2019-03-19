import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j08PrintLnksCntLimitScopeWD {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coldriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		for(int i=1;i<coldriver.findElements(By.tagName("a")).size();i++)
		{
			String keyboardkeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(keyboardkeys);
			Thread.sleep(5000L);
		}
		
		Set<String> winhIds=driver.getWindowHandles();
		Iterator<String> it=winhIds.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}
		
		
	//	driver.quit();
	}

}
