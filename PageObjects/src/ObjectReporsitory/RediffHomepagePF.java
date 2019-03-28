package ObjectReporsitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepagePF {

	
	WebDriver driver;
	
	public RediffHomepagePF(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By searchTxt=By.name("srchword");
	
	
	
	
	public WebElement searchTxt() {
		return driver.findElement(searchTxt);
	}

	
	
}
