package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.AfterClass;

public class Junittestcase {
	@Test
	public void testcase1() {
		System.out.println("Testcase1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Testcase2");
	}
	@Test
	public void testcase3() {
		System.out.println("Testcase3");
	}
	
	@BeforeClass
	public static void setupbeforeclass() throws Exception {
		System.out.println("BeforeClass");
	}
////	@AfterClass
////	public static void setupaftercalss throws Exception {
//		System.out.println("AfterClass");
//	}
	@After 
	public void aftermethod() {
		System.out.println("After");
	}
	@Before
	public void beforemethod() {
		System.out.println("Before");
	}

}
