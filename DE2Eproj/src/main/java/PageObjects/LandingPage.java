package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By SignIn=By.cssSelector("a[href*='sign_in'");
	By TitleText=By.xpath("//section[@id='content']/div/div/h2");
	By Contact=By.xpath("//a[contains(text(),'Contact')]");
	By navbar=By.cssSelector("ul.nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getLogin() {
		return driver.findElement(SignIn);
	}
	
	public WebElement getTitleText() {
		return driver.findElement(TitleText);
	}
	
	public WebElement getnavbar() {
		return driver.findElement(navbar);
	}
	
}
