package com.webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {


		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		public void applicationLaunch()
		{

			System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println(" ********* Chrome Browser Launched Successfully *********");

	
			driver.get(applicationUrlAddress);
			System.out.println(" Navigated to timeand date application ");

			driver.manage().window().maximize();

			}
		public void  aPPlicationClose()
		{
			
		
		driver.quit();
		System.out.println("*****************Applicationclosedsuccessfully");

	}

}
