import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example01Sel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com");
		
		
	}

}
