package com.validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle
{

	public static void main(String[] args) {
		//Automatig chomebrowser
		System.setProperty(" webdriver.chome.driver","./webDriver/chromedriver.exe");
		
		ChromeDriver ChomeBrowser=new ChromeDriver();
		
		String  applicationURLAddress="https://bing.com";//url address is assigned to a variable 
		
		//variable name (appicationUrladdress );           
		
		ChomeBrowser.get(applicationURLAddress);
		
		
	//	expected  title of the bing homepage is_ shoulb be bing 
		String expected_BingHomepageTitle ="Bing";
		System.out.println(" the expected title of the bing home page is:-"+expected_BingHomepageTitle);
		 
		
   
		
		String actual_BingHomepageTitle =ChomeBrowser.getTitle();
		System.out.println(" the actual title of the bing home page is:-"+actual_BingHomepageTitle);
		 
		//if(actual_binghome page title .equals(expected_bing homepagetitle))
		if(actual_BingHomepageTitle.equals(actual_BingHomepageTitle))
		
		
		{
			System.out.println("The Title of the  bing homepage is matched _pass");
			
		}
		else
	
		{
			System.out.println("The Title of the  bing homepage is not  matched _fail");

			
		}
 ChomeBrowser.quit();
	}

}
