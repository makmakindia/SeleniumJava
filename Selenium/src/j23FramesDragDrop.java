import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class j23FramesDragDrop {

	public static void main(String[] args) {
		// http://jqueryui.com/droppable/
		

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		WebElement wed= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(wed);
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click();
		
		WebElement source1=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement target1=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source1, target1).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		
		
		driver.quit();
	}

}
