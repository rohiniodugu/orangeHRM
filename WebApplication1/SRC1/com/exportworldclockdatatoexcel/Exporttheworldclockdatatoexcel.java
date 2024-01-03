package com.exportworldclockdatatoexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exporttheworldclockdatatoexcel {

	
		ChromeDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		public void applicationlaunch()
		{

			System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println(" ********* Chrome Browser Launched Successfully *********");

	
			driver.get(applicationUrlAddress);
			System.out.println(" Navigated to worldclockpage ");

			driver.manage().window().maximize();

			}
		public void gettableData()
		{///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
			String  worldclockproperty1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/";
			String   worldclockproperty2="/td[1]";
			for( int index=1;index<=36;index++)
			{
				
		 By worldclockproperty=By.xpath(worldclockproperty1+index+worldclockproperty2);
		 WebElement cityname=driver.findElement(worldclockproperty);
		 
			}
			
		}}


	

