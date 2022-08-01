package TESTNG;

import org.testng.annotations.Test;

public class testNG_priority {
	
	@Test(priority=-1)
	public void c() 
	{
		System.out.println("testMethod_1");
	}
	@Test(priority=-1)
	public void a() 
	{
		System.out.println("testMethod_2");
	}
	@Test(priority=-1,dependsOnMethods = {"c"})
	public void d() {
		System.out.println("testMethod_3");	
		}

}
