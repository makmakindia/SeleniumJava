package ObjectReporsitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	
	WebDriver driver;
	
	public RediffLoginpagePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*	By username=By.xpath("//input[@name='login']");
	By password=By.name("passwd");
	By go=By.name("proceed");
	By Homelink=By.linkText("Home");*/
	
	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(name="proceed")
	WebElement go;
	@FindBy(linkText="Home")
	WebElement Homelink;
	
	
	
	public WebElement emailId() {
		return username;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Seubmit() {
		return go;
	}
	
	public WebElement HomeLink() {
		return Homelink;
	}
	
	
}
