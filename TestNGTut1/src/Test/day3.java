package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;







public class day3 {
	
	@BeforeMethod
	public void BMethod() {
		System.out.println("I will execute before every method .... @BeforeMethod scope is at day3 class level");
	}

	
	@Test(dataProvider="getDataProvidersValues")
	public void WebLoginCarLoan(String dusername, String dPassword) {
		System.out.println("WebLoginCarLoan....!");
		System.out.println(" ********** User Name : "+dusername+" Password : "+dPassword+" ************");

	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan....!");
		Assert.assertTrue(false);
	}
	
	@Test(enabled=false)
	public void MobileSignInCarLoan() {
		System.out.println("MobileSignInCarLoan....!");
	}
	
	@Test
	public void MobileSignOutCarLoan() {
		System.out.println("MobileLoginCarLoan....!");
	}
	
	
	@BeforeSuite
	public void BSuite() {
		System.out.println("I Will execute before suite @BeforeSuite");
	}
	@Parameters({"CarLoanURL","APIKey"})
	@Test
	public void APILoginCarLoan(String CarLoanURLVal, String APIKeyVal) {
		System.out.println("LoginAPICarLoan ....!");
		System.out.println("CarLoanURL pama value :"+CarLoanURLVal);
		System.out.println("APIKEY  parama Value : "+APIKeyVal);
	}
	@Test
	public void APISignInCarLoan() {
		System.out.println("LoginAPICarLoan ....!");
	}
	
	@DataProvider
	public Object[][] getDataProvidersValues() {
		
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="FirstSetUsername";
		data[0][1]="FirstsetPassword";
		
		data[1][0]="SecondsetUsername";
		data[1][1]="SecondsetPassword";
		
		data[2][0]="ThirdsetUsername";
		data[2][1]="ThirdsetPassword";
		
		return data;
	}


}
