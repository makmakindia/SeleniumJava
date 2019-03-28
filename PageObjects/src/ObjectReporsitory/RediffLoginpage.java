package ObjectReporsitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	By username=By.xpath("//input[@name='login']");
	By password=By.name("passwd");
	By go=By.name("proceed");
	By Homelink=By.linkText("Home");
	
	public WebElement emailId() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Seubmit() {
		return driver.findElement(go);
	}
	
	public WebElement HomeLink() {
		return driver.findElement(Homelink);
	}
	
	
}
