package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Bing_Homepage_screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String applicationUrlAddress ="http://bing.com";
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("*************chromebrowser launched successfully**********");
		
		
		//Navigating to orangeHRM Application Urladdress
		
		driver.get(applicationUrlAddress);
		
		System.out.println("Navigated to Bing homepage");
		//Takescreenshot-is an interface in selenium
		//driver-is an Object
		//Typecasting
		//OutputType-is an interface in selenium
		File bingscreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingscreenshot, new File("./bingscreenshot/bingscreenshot.png"));
		 driver.quit();
		
		
		
		
	
		
		
		

	


	

	}


	}


	


