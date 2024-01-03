package com.Mouseoveroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hellosign_YourWishList_click {

	
		WebDriver driver;
		
		String  applicationUrlAddress="https://amazon.in";
		public void applicationLaunch()
		{
			System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
			driver=new  ChromeDriver();
			driver.get(applicationUrlAddress);
		
		driver.manage().window().maximize();
		
		}
		public void YourWishListTest()
		{
			//Hello signin property
			//d="nav-link-accountList"
				
					By  helosigninproperty=By.id("nav-link-accountList");
					  WebElement  helosignin=driver.findElement(helosigninproperty);
					  
					//actions- class is used to  perform operations  related  to either  mouse of function
					  // keys of the key board 
			Actions    helosigninactions=new Actions(driver);
			  helosigninactions.moveToElement(helosignin).build().perform();
			  
				//Your Wish list is an element of type link 
			  By  YourWishListproperty=By.linkText("Your Wish List");
			  WebElement  yourWishList=driver.findElement(YourWishListproperty);
			  
			  yourWishList.click();
		}
		public void applicationclose()
		{
			driver.close();
		}
			public static void main(String[] args)
			{
			
				Amazon_Hellosign_YourWishList_click amazon=new  Amazon_Hellosign_YourWishList_click();
				amazon.applicationLaunch();
				amazon.YourWishListTest();
				amazon.applicationclose();
		}
		

	}


