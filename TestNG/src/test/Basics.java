package test;


import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Basics extends globalParams {
	
	
	@AfterSuite // Anotation 
	public void ASuite() {
		System.out.println("After Suite executed ");
	}
	@Test(groups="Smoke")
	public void Demo() throws IOException {
		OpenBrowser();
		System.out.println(" Demo Hello TestNG....!");
	}
	@Test(enabled=false)
	public void Test2() {
		System.out.println(" Test2 TestNG 2nd Test  ");
	}
	
	@BeforeClass
	public void BClass() {
		System.out.println("Before executing any method @BeforeClass");
	}
	@AfterTest
	public void lastExecution() {
		System.out.println(" lastExecution execute after test @AfterTest lastExecution");
	}
}
