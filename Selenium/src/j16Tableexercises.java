import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j16Tableexercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "D:\\work\\Selenium\\Drivers\\new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get(
//				"http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
//		https://www.cricbuzz.com/live-cricket-scores/21534/ind-vs-aus-3rd-odi-australia-tour-of-india-2019
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22242/indw-vs-engw-2nd-t20i-england-women-tour-of-india-2019");
//				"https://www.cricbuzz.com/live-cricket-scorecard/20203/rsa-vs-sl-2nd-odi-sri-lanka-tour-of-south-africa-2019");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		
		int count1 = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
	
		
		for (int i1 = 0; i1 < count1 - 2; i1++) {
			String value1 = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(1)")).get(i1)
					.getText();
			
			String value2 = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i1)
					.getText();
			
		
			
			System.out.println("Name : "+value1+" 		Runs : "+value2);
			//int valueinteger = Integer.parseInt(value);
		//	sum = sum + valueinteger;// 103
		}
		String Extras1 = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		System.out.println(" ***************Extras : "+Extras1);
		
		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueinteger = Integer.parseInt(value);
			sum = sum + valueinteger;// 103
		}
		// System.out.println(sum);

		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int TotalSumValue = sum + extrasValue;
		System.out.println(TotalSumValue);

		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue = Integer.parseInt(ActualTotal);
		if (ActualTotalVAlue == TotalSumValue) {
			System.out.println("Count Matches");
		} else {
			System.out.println("count fails");
		}
		
		//driver.quit();
	}

}
