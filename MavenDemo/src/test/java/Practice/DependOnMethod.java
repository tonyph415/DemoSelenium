package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {
	@Test
	public void login(){
		
		System.out.println("Login Application");
	}
	@Test(dependsOnMethods = {"login"})
	public void search(){
		Assert.assertEquals("abc", "xyz");
		System.out.println("Search the tickets");
		
	}
	@Test(dependsOnMethods = {"search"},alwaysRun = true) //it will execute even if the previous method fails
	public void book(){
		
		System.out.println("Book the tickets");
	}
	@Test
	public void logout(){
		
		System.out.println("Logout Application");
	}

}