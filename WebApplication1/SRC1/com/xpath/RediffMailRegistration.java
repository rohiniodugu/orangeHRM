package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailRegistration {

	public static void main(String[] args) {
		WebDriver driver;
		String Applicaytionurladdress="https://register.rediff.com/register/register.php?FormName=user_details";
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Applicaytionurladdress);
		driver.manage().window().maximize();
		//<input type="text" onblur="fieldTrack(this);" name="name49564ea9" value="" style="width:185px;" maxlength="61">
		//<input type="text" onblur="fieldTrack(this);" name="name90f239c7" value="" style="width:185px;" maxlength="61">
		//*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
//in certain applications  we had elements  whose xpath constantly  change they are called as dynamic xpath they can be handled  using 3 different  java script functions
	By fullnameproperty=By.xpath("//input[starts-with(@name,'name')]");
WebElement fullname=driver.findElement(fullnameproperty);
fullname.sendKeys("rohini");

	}

	}

