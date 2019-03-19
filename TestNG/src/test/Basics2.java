package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics2 {
	@Parameters({"TestLevelParamPriceValue"})
	@Test
	public void Test3(String Price) {
		System.out.println("Test3 Test 3 ..... ");
		System.out.println(" TestLevelParamPriceValue : "+Price);
	}

}
