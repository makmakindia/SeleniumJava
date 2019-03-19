import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j05xpathParentChildRel {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver d = new ChromeDriver();

		d.get("https://www.google.com");
		d.findElement(By.xpath("//form[@id='tsf']/div/div/div/div/div/input")).sendKeys("Seleniumhq");
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//*[text()='Sign in']")).click();

		/*
		 * d.get("http://www.qaclickacademy.com/interview.php");
		 * 
		 * d.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		 * System.out.println(d.getTitle());
		 * //div[@jsmodel='vWNDde']/div/div/div/div/input"
		 * 
		 */

		d.quit();

	}

}
