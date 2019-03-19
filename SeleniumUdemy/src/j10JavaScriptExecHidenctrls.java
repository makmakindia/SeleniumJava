import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j10JavaScriptExecHidenctrls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://apsrtconline.in");
			// fromPlaceName
		driver.findElement(By.id("fromPlaceName")).sendKeys("ANAN");
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		String script=" return document.getElementById(\"fromPlaceName\").value";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("ANANTHAGIRI -ARAKU")) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				
				break;
			}
		}
		// ANANTHAGIRI PACKAGE
		
		if(i>10) {
			
			System.out.println("Value  not found");
		}
		else {
			System.out.println("Value found");
		}
		
		driver.quit();
		
		
	}

}
