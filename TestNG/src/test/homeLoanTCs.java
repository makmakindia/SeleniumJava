package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class homeLoanTCs {
	@Parameters({"URL","TestLevelParamPriceValue"})
	@Test
	public void webLoginHomeLoan(String baseURL, String Pricevalue) {
		System.out.println("webLoginHomeLoan");
		System.out.println(baseURL);
		System.out.println(Pricevalue);
		Assert.assertTrue(false);
	}
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobileLoginHomeLoan");
	}
	@Test(groups="Smoke")
	public void APILoginHomeLoan() {
		System.out.println("APILoginHomeLoan");
	}
	
	@BeforeMethod
	public void Bmethods() {
		System.out.println("Bmethods....@BeforoMethod....");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("Clean DB data before starting tests ...");
	}
	@BeforeSuite
	public void Bsuite() {
		System.out.println("@Beforesuite executed");
	}
}
