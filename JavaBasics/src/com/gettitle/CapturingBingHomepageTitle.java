package com.gettitle;

import org.openqa.selenium.chrome.ChromeDriver;



public class CapturingBingHomepageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//Automating chromeBrowser
	System.setProperty("webdriver.chrome.driver","./webDriver/chromedriver.exe");
	ChromeDriver ChromeBrowser =new ChromeDriver();
	  String applicationUrlAddress="http://bing.com";// url address is assigned to variable
	  //variable name (applicationURL address)is passed as an argument to the get   
	  ChromeBrowser.get(applicationUrlAddress);
	  
	 String actual_BingHomepageTitle=ChromeBrowser.getTitle();
	 System.out.println("the actual title of the bing home page is :-"+actual_BingHomepageTitle);
	 
	 ChromeBrowser.quit();
}
}

