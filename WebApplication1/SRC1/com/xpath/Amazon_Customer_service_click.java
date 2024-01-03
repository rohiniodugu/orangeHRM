package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Customer_service_click {
public static void main(String[] args) {
	

		WebDriver driver;
		String Applicaytionurladdress="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Applicaytionurladdress);
		driver.manage().window().maximize();
		
		
		//<a href="/gp/help/customer/display.html?nodeId=200507590&amp;ref_=nav_cs_help" class="nav-a  " tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_7" data-csa-c-content-id="nav_cs_help" data-csa-c-id="87fngq-v0wxi2-708tuz-1y0yjn">Customer Service</a>
	
	}

}
