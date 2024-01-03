package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
public class OHRM_LoginTest {
public static void main(String[] args) {
	
	ChromeDriver driver;
	String applicationUrladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	//automating chrome browser
	System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");

	driver=new ChromeDriver();
	//navigating to OrangeHRMApplicationUrl address

	driver.get(applicationUrladdress);
	//validating Orange HRM Applicationl Loginpage title
	//Expected Title of the Orange HRM ApicationLogin page should be -OrangeHRM
	String  expected_OrangeHRMApplicationLoginpageTitle="OrangeHRM";
	System.out.println("The expected title of the OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationLoginpageTitle);
	//operation on the webpage
	String  actual_OrangeHRMApplicationLoginpageTitle=driver.getTitle();
	System.out.println("The  actual title of the OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationLoginpageTitle);

	if(actual_OrangeHRMApplicationLoginpageTitle.equals(expected_OrangeHRMApplicationLoginpageTitle))
	{
		System.out.println("OrangeHRM Application Login page MATCHED-PASS");
		
		
	}
	else
	{
		System.out.println("OrangeHRM Application Login page MATCHED-PASS");
		
	}
	System.out.println();
	//validating URL address
	//Expected-OrangeHRM Application Urladdress should  have a text Orangehrm-4.2.0.1

	String  expected_OrangeHRMApplicationUrladdress="orangehrm-4.2.0.1";
	System.out.println("The expected Url address of  OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationUrladdress);

	String  actual_OrangeHRMApplicationUrladdress=driver.getCurrentUrl();
	System.out.println("The actual Url address of  OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationUrladdress);

	if(actual_OrangeHRMApplicationUrladdress.contains(expected_OrangeHRMApplicationUrladdress))
	{
		System.out.println("the OrangeHRM Alication Urladdress  MATCHED-PASS");
	}
	else {
		System.out.println("the OrangeHRM Alication Urladdress  notMATCHED-FAIL");
		

	}
	







	
//verifying and Validating Username (elememt)
//the element of the webpage is identified based on the its properties 

//properties of the elements are identified by inspecting it -right click on the 
//element under test -select inspect option 
	
//right click on the HIGHLIGHTED source code -select copy -select outer HTML
//<inputname="txtUsername"id="txtUsername"type="text">
//The properties of the element  always contains attributes and their corresponding values 
/*
 <inputname="txtUsername"id="txtUsername"type="text">
 <-tag
 
 
 <input-attribute
 txtUsername-value 
 
 id-attribute/locator
 txtUsername-value/selector
 type-attribute
 text-value
 */

//the avaliable properties of the inspected element  we should look for an existance 
//of locator of the selenium webDriver
//properties contains Locators and their corresponding values 
//id -atribute/Locator 
//txtUsername-value/selector 
//1.identifying the element uniquely out of other elements of the webpage 
//2.performing the operation  on the element
driver.findElement(By.id("txtUsername")).sendKeys("rohini");
//password elementproperties
// <inputname="txtpassword"autocomplete="off"type="password">
//name-locator
//txtpassword-selector
//id="txtpassword"
driver.findElement(By.name("txtPassword")).sendKeys("Rohiniodugu@12345");
//<inputtype="submit"   class="button" value="LOGIN">
driver.findElement(By.className("button")).click();
driver.quit();
	}


}



































































	
	
	


