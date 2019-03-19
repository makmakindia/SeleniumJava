package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class carLoanTCs {
	
	
	@Test(dataProvider="getdata")
	public void WebLoginCarloan(String username, String Password) {
		System.out.println("WebLoginCarloan");
		System.out.println("User Name : "+username+" Password : "+Password);
		
	}
	@Test(groups="Smoke")
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
		
	}
	@Test(dependsOnMethods="WebLoginCarloan")
	public void APILoginCarLoan() {
		System.out.println("APILoginCarLoan");
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[3][2];
		//1St row
		data[0][0] = "Firstusername";
		data[0][1] = "Firstpassword";
		//2nd Row
		data[1][0] = "SecondUSername";
		data[1][1] = "SecondPassword";
		//3rd Row
		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";
		return data;
	}

}
