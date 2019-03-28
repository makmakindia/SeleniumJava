package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By Email=By.id("user_email");
	By Password=By.id("user_password");
	
	






	public WebElement getEmail() {
		return driver.findElement(Email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	

	
}
