package com.TestNG1;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1)
	public void application()
	{
		System.out.println("**************Gmail Application Launched sucessfully*****************");
		
		
	}
	@Test(priority=4)
	public void sentmailTest() {
		System.out.println("*****sentmail test executed successfully");
	}
	@Test(priority=3)
	
	public void composemailTest() {
		System.out.println("**************compose mail Test executed successfully***************");
	}

	@Test(priority=2)
	public void logintest() {
		System.out.println("***********loginTest executed successfully****************");
	}
	
	

}


