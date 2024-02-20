package selenium.interview.series;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSequence {

	
	/***
	 * Sequence of TestNG is 
	 * 
	 * @BeforeSuite
	 * @BeforeTest
	 * @BeforeClass
	 * @BeforeMethod
	 * @Test
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 * @AfterSuite
	 */
	
	@BeforeSuite
	public void beforSuite() {
		
		System.out.println("in Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("In Before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in Before Methos");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In Before Test");
	}
	
	@Test
	public void test() {
		
		System.out.println("in Test Mehhod");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("In After Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("in After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("in After Suite");
	}
}
