import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/interview.php");
	

	
	// Traverse from parent to child using following-sibling::tagName
	driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
	driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li[1]")).click();
	System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li[1]")).getText());
	
	
	// Traverse from child to parent using parent::tagname
	driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).click();
	//System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getText());
	
	driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
	System.out.println(driver.findElement(By.xpath("//*[text()=' Selenium ']")).getText());
	//driver.quit();
	
	

//	driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//	driver.findElement(By.cssSelector("#login1")).sendKeys("SDFSDFSDF");
//	driver.findElement(By.cssSelector("#password")).sendKeys("Passafafdfd");
//	driver.findElement(By.xpath("//input[@name='proceed']")).click();
//	System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[1]")).getText());
	//driver.findElement(By.xpath("//input[contains(@name,'procee']")).click();
//	driver.findElement(By.cssSelector(" div.global-nav-login-flydown.global-login")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("USername css selctor");
//	driver.findElement(By.cssSelector("input.r4.wide.mb16.mt8.password")).sendKeys("DSFSDFSDF");
//	driver.findElement(By.cssSelector("#Login")).click();
//	String Str1 = driver.findElement(By.cssSelector("#error")).getText();
//	System.out.println(Str1);
	//driver.quit();
//	driver.get("https://login.salesforce.com");	
//	driver.findElement(By.id("username")).sendKeys("Username ID locator");
//	driver.findElement(By.name("pw")).sendKeys("Password Name locator");
//	driver.findElement(By.linkText("Forgot Your Password?")).click();
//	//driver.findElement(By.className("button r4 wide primary")).click();
//	String Str1 = driver.findElement(By.className("label")).getText();
//	System.out.println(Str1);

	//ClassName
	//CSSSelector
	//Id
	//LinkText
	//Name
	//PartialLinkText
	//TagName
	//Xpath
	
	//Valaidate xpath & CSS  locators in browser 
	// $x("<Xpath")
	// $("CSSSelector")
	
	//Syntax for xpath 
	// //tagname[@attribute='value']
	// //tagname[@contains(@attribute, Value)]  -- Regular expression 
	
	// tagname[attribute='value']
	// tagbane[attribute*='']
	
	
	// xpath parent child relationship
	
	
	}

}
