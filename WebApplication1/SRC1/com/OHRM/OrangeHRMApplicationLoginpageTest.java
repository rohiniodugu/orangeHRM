package com.OHRM;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationLoginpageTest {
	public static void main(String[] args) {
		
		ChromeDriver driver;
		String applicationUrladdress="http://127.0.01/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		//automating chrome browser
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		//navigating to OrangeHRMApplicationUrl address

		driver.get(applicationUrladdress);
		//validating Orange HRM Applicationl Loginpage title
		//Expected Title of the Orange HRM ApicationLogin page should be -OrangeHRM
		String  expected_OrangeHRMApplicationLoginpageTitle="OrangeHRM";
		System.out.println("The expected title of the OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationLoginpageTitle);
		//operation on the webpage
		String  actual_OrangeHRMApplicationLoginpageTitle=driver.getTitle();
		System.out.println("The  actual title of the OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationLoginpageTitle);

		if(actual_OrangeHRMApplicationLoginpageTitle.equals(expected_OrangeHRMApplicationLoginpageTitle))
		{
			System.out.println("OrangeHRM Application Login page MATCHED-PASS");
			
			
		}
		else
		{
			System.out.println("OrangeHRM Application Login page MATCHED-PASS");
			
		}
		System.out.println();
		//validating URL address
		//Expected-OrangeHRM Application Urladdress should  have a text Orangehrm-4.2.0.1

		String  expected_OrangeHRMApplicationUrladdress="orangehrm-4.2.0.1";
		System.out.println("The expected Url address of  OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationUrladdress);

		String  actual_OrangeHRMApplicationUrladdress=driver.getCurrentUrl();
		System.out.println("The actual Url address of  OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationUrladdress);

		if(actual_OrangeHRMApplicationUrladdress.contains(expected_OrangeHRMApplicationUrladdress))
		{
			System.out.println("the OrangeHRM Alication Urladdress  MATCHED-PASS");
		}
		else {
			System.out.println("the OrangeHRM Alication Urladdress  notMATCHED-FAIL");
			

		}
		}
	}

