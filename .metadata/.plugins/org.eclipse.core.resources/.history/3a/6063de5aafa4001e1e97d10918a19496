package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogintest {

	public static void main(String[] args) {
	WebDriver driver;
	String Applicaytionurladdress="https://gmail.com";
	System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Applicaytionurladdress);
	driver.manage().window().maximize();
	
	
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username" spellcheck="false" tabindex="0" aria-label="Email or phone" name="identifier" value="" aria-disabled="false" autocapitalize="none" id="identifierId" dir="ltr" data-initial-dir="ltr" data-initial-value="">
	 By emailproperty=By.xpath("//input[@class='whsOnd zHQkBf']");
	WebElement email=driver.findElement(emailproperty);
	Object rohiniodugu;
	Object gmail;
	email.sendKeys("rohiniodugu@gmail.com");
         //syntax
	//xpath using text()-textmethod()
	//tagName[text()-'extvalue'
	//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
	 By nextbuttonproperty=By.xpath("//span[text()='Next']");
	WebElement nextbutton=driver.findElement(nextbuttonproperty);
	//nextbutton.click();
	

	}

}
