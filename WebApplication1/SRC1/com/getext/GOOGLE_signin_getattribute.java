package com.getext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOOGLE_signin_getattribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver is  an interface of the selenium 
		
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		
		//Automating Chromebrowser
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		
		//Navigating to Google Aplication Url Address
		driver=new ChromeDriver();
		
		//navigating to Google Aplication Url Address
		 driver.get(applicationUrlAddress);
		/*	<a aria-label="Sign in"	
		//	href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
				 target="_top"><span>Sign in</span></a>

				
					
					
						//	<a aria-label="Sign in"	  //</> before this   closing tag what ever their <a means anchor tag,href whenever there this two tags  then we have to take  linxktex or partial link text as a locators and their corresponding  values as selectors
					
					
					
				//	href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
		 target="_top"><span>Sign in</span></a>
		 <-tag
		 <a-anchor tag
		href-attribute
		value-https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"(hyper linktext)
			the type of  element  is always  going to be a link
			locator-linkText
			selector-signin
			*/
		//By signin property=By.linkText("sign in");
		
	By	signinproperty=By.linkText("Sign in");

	/*selector should provided with the complete  text of link
	By signinproperty=By.partialLinkText("sign");
	selector  should be provided witha part of the Text  of the link*/
	WebElement signin=driver.findElement(signinproperty);
	String signinHrefAttributevalue=signin.getAttribute("href");
	System.out.println("the attribute  value of Href of signin WebElementis:-"+signinHrefAttributevalue);
	
	System.out.println();
	String signinText=signin.getText();

	System.out.println("the text of the WEbelement signin is:-"+signinText);
	signin.click();

	
	//driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
