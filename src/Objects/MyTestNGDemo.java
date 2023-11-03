package Objects;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNGDemo {
	
	@BeforeTest
	public void logintoapplication()
	{
		System.out.println("login to application ");
	}
	
	@AfterTest
	public void logoutfromapplication()
	{
		System.out.println("Logout from application ");
	}
	
	@Test(priority=1, description="this is login test")
	public void test1()
	{
		System.out.println("test1");
		
	}
	
	@Test(priority=2, description="this is logout test")
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	
}
