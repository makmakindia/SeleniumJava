import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class j13objects_custom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
//		driver.get("http://www.qaclickacademy.com/practice.php");
//		
//		Select sDrop=new Select(driver.findElement(By.id("dropdown-class-example")));
//		//sDrop.selectByValue("option2");
//		//sDrop.selectByIndex(3);
//		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
		// OR
	
//		int i=1;
//				while(i<5) {			
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic drop downs 
		//ctl00_mainContent_ddl_originStation1_CTXT
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[6]/a")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();*/
		
		
	}

}
