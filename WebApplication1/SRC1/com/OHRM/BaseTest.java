package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
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
	System.out.println("application closed successfully");
}

	

}
