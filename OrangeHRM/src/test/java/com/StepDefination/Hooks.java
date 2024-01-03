package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import jdk.internal.org.jline.utils.Log;

public class Hooks {
	 public static WebDriver driver;
		
		@Before
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		com.utility.Log.info(" ********* Chrome Browser Launched Successfully *********");
	}

		
	@After
	public static void teardown() {
		driver.quit();
		Log.info("****successfully close the browser along with orangeHRM Application");
	}

	}



