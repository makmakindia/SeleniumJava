import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class j15remoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
/*		DesiredCapabilities dc= new 	DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);*/
		
		DesiredCapabilities dc= new 	DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.6:4444/wd/hub"),dc);
		
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[text()='Gmail']")).click();
		driver.quit();
	}

}
