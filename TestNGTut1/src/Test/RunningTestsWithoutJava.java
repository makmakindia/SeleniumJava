package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class RunningTestsWithoutJava {
	
	@AfterTest
	public void lastExec() {
		System.out.println("I will execute last @AfterTest");
	}
	@Test
	public void demoTestNg() {
		System.out.println("demoTestNg test case");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second Test in single TestNG file ");
	}

}
