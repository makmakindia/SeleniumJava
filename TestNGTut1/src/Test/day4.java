package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

public class day4 {
	
	@AfterSuite
	public void ASuite() {
		System.out.println("I WIll execute after suite ...@AfterSuite");
	}
	@Parameters({ "URL" })
	@Test
	public void WebLoginHomeLoan(String URLName) {
		System.out.println("WebLoginHomeLoan....!");
		System.out.println("URL Param Value : "+URLName);
	
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHomeLoan....!");
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan","MobileLoginHomeLoan"})
	public void APILoginHomeLoan() {
		System.out.println("APILoginHomeLoan ....!");
	}

}
