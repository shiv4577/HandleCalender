package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing {
	
	
	@BeforeSuite
	
	public void TestBeforeSuite() {
		System.out.println("Before Suite");
	}
	/*
	 * @BeforeClass
	 * 
	 * public void TestBeforClass() {
	 * 
	 * System.out.println("BeforeClass"); }
	 */
	
	/*
	 * @BeforeMethod
	 * 
	 * public void TestBeforeMethod() {
	 * 
	 * System.out.println("Before method"); }
	 */
	
	@Test
	public void TestCase1() {
		System.out.println("Test Case1");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void TestCase3() {
		System.out.println("Test case 3");
	}
	
	@AfterMethod
	public void TestAfterMethod() {
		System.out.println("After Method");
	}

	/*
	 * @AfterClass public void TestAfterClass() { System.out.println("After Class");
	 * }
	 */
	
	@AfterSuite
	
	public void AfterSuite() {
		System.out.println("After Suite ");
	}
}
