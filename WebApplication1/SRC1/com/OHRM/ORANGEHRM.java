package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ORANGEHRM {
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	
public void applicationlaunch()
{
	System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	System.out.println(" ********* Chrome Browser Launched Successfully *********");

	driver.get(applicationUrlAddress);
	System.out.println(" Navigated to OrangeHRM Application ");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}

public void applicationclose() {
	driver.quit();
}

	
}
