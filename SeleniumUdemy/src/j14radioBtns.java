import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j14radioBtns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).size());
		
		int count=driver.findElements(By.xpath("//input[@name='radioButton']")).size();
		
		for(int i=0;i<count;i++) {
		
			driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).get(i).get);
			
			
		}
		
		System.out.println(driver.findElements(By.xpath("//input[@id='checkBoxOption1']")).size());
		
		
	}

}
