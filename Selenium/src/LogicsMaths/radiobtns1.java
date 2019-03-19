package LogicsMaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobtns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		int count = driver.findElements(By.xpath("//input[@name='webform']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			driver.findElements(By.xpath("//input[@name='webform']")).get(i).click();
			String str1=driver.findElements(By.xpath("//input[@name='webform']")).get(i).getAttribute("value");
			System.out.println("Elemnet : "+str1);
		}
		driver.quit();

	}

}
