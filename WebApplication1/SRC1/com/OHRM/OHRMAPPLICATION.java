package com.OHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHRMAPPLICATION {

	

	public static void main(String[] args, Object get) {
		// TODO Auto-generated method stub

		ChromeDriver driver;
		String applicationUrladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		//automating chrome browser
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		//navigating to OrangeHRMApplicationUrl address

		driver.get(applicationUrladdress);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
			System.out.println("OrangeHRM Application Login page MATCHED-fail");
			
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
		
	

//expected text shouldbe" LOGIN PAnel"
		
	String expected_OrangeHRMApplication_Loginpage_LoginpanelText="LOGINPanel";	
	System.out.println("the expected  text of the orange HRM application Loginpage login panel  is:-"+expected_OrangeHRMApplication_Loginpage_LoginpanelText);	
		
//<div id="logInPanelHeading">LOGIN Panel</div>
	
	 By loginpanelTextProperty=By.id("logInPanelHeading");
	 WebElement loginpanel=driver.findElement(loginpanelTextProperty);
			 
		
	String actual_OrangeHRMApplication_Loginpage_LoginpanelText= getText();
	System.out.println("the actual text of the orange HRM application Loginpage login panel is:-"+actual_OrangeHRMApplication_Loginpage_LoginpanelText);	
	if(actual_OrangeHRMApplication_Loginpage_LoginpanelText.equals(expected_OrangeHRMApplication_Loginpage_LoginpanelText))
	{
		System.out.println("OrangeHRM APPlication LoginpageText existing_PASS");
	}
	else
	{
		
	}

	System.out.println("OrangeHRM APPlication LoginpageText notexisting_failed");	


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
//driver.findElement(By.id("txtUsername")).sendKeys("rohini");

 /*By UserNameproperty=By.id("txtUsername");//it is aproperty of an element assigned to a variable(username property)
 
 driver.findElement(UserNameproperty).sendKeys("rohini");//identifying the element andperforming an operationon the element*/
		/*By UserNameproperty=By.id("txtUsername");
		//identifying the property of an element assinged to a variable
		//the property of the element should be  identified in the webpage 
		WebElement userName=driver.findElement(UserNameproperty);
		//webelement  is an   interface of selenium(which can be treated as  data type)
		performing an operation on the identified webelement 
		
	//	userName.sendKeys("rohini");
		*/
	
	//validating loginfunctionality******************************************************
 //automating UserName WebElement
		
		String  UserNameTestData="rohini";
		//TestData-which should be passed to sendkeys method 
		By UserNameproperty=By.id("txtUsername");
		//identifying the property of an element assinged to a variable 
		//the property of the element should be  identified in the webpage 
		WebElement userName=driver.findElement(UserNameproperty);
		//webelement  is an   interface of selenium(which can be treated as  data type)
		//performing an operation on the identified webelement 
		
		userName.sendKeys(UserNameTestData);
		
		//automating Password WebElement
		// <inputname="txtpassword" id="txtPassword"autocomplete="off"type="password">
		
		String PasswordTestData="Rohiniodugu@12345";//TestData
		By PasswordProperty=By.id("txtPassword");//identify the property 
		WebElement password=driver.findElement(PasswordProperty);//identify the webelement 
		password.sendKeys(PasswordTestData);//operation on webelement
		//automating logout element
	//	<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By loginButtonproperty=By.className("button");
		WebElement loginbutton=driver.findElement(loginButtonproperty);
		loginbutton.click();
		
		//validating orangeHRMApplication HOMEPAGE  should have a text welcome
		/*String expected_Homepagetext="Welcome";
		System.out.println("The expected text of Homepage is :-"+expected_Homepagetext);
		
		
		String actual_Homepagetext="Welcome";*************
		System.out.println("The actual text of Homepage is :-"+actual_Homepagetext);*/
		
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		 By WelcomeAdmin=By.linkText("Welcome Admin");
		 WebElement WelcomeAdmin1=driver.findElement(WelcomeAdmin);
		 String expectedHomepage="Welcome";
		 String actualHomepageWelcomeAdminText=WelcomeAdmin1.getText();
		 if(actualHomepageWelcomeAdminText.contains(expectedHomepage))
		 {
			 System.out.println("Login successful-pass");
		 }
		 else
		 {
			 System.out.println("Login failed-FAIL");

		 }
		  WelcomeAdmin1.click();
		  
		//  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		  
		  By logoutbutton=By.linkText("Logout"); 
		  
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  
		   wait.until(ExpectedConditions.visibilityOfElementLocated(logoutbutton));
			  WebElement logoutbutton1=driver.findElement (logoutbutton);
			  String  expected_OrangeHRMApplicationLoginpageTitle1="OrangeHRM";
				System.out.println("The expected title 1 of the OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationLoginpageTitle1);
				//operation on the webpage
				String  actual_OrangeHRMApplicationLoginpageTitle1=driver.getTitle();
				System.out.println("The  actual title 1 of the OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationLoginpageTitle1);

				if(actual_OrangeHRMApplicationLoginpageTitle1.equals(expected_OrangeHRMApplicationLoginpageTitle1))
				{
					System.out.println("OrangeHRM Application1 Login page MATCHED-PASS");
					
					
				}
				else
				{
					System.out.println("OrangeHRM Application Login page MATCHED-fail");
					
				}
				System.out.println();
				//validating URL address
				//Expected-OrangeHRM Application Urladdress should  have a text Orangehrm-4.2.0.1

				String  expected_OrangeHRMApplicationUrladdress1="orangehrm-4.2.0.1";
				System.out.println("The expected Url address1 of  OrangeHRM Application login page is :-"+expected_OrangeHRMApplicationUrladdress1);

				String  actual_OrangeHRMApplicationUrladdress1=driver.getCurrentUrl();
				System.out.println("The actual Url address1 of  OrangeHRM Application login page is :-"+actual_OrangeHRMApplicationUrladdress1);

				if(actual_OrangeHRMApplicationUrladdress1.contains(expected_OrangeHRMApplicationUrladdress1))
				{
					System.out.println("the OrangeHRM Alication Urladdress1  MATCHED-PASS");
				}
				else {
					System.out.println("the OrangeHRM Alication Urladdress1  notMATCHED-FAIL");
					

				}
				
			

		   logoutbutton1 .click();
		   
		   driver.quit();
		   
	}

	private static String getText() {
		// TODO Auto-generated method stub
		return null;
	}
}
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


