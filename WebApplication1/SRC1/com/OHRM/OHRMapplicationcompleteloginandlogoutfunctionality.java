package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OHRMapplicationcompleteloginandlogoutfunctionality {
	public static void main(String[] args) throws  InterruptedException{




WebDriver driver;
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

// Automating Chrome Browser
System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
driver = new ChromeDriver();

System.out.println(" ********* Chrome Browser Launched Successfully *********");

// Navigating to OrangeHRM Application Url Address
driver.get(applicationUrlAddress);
System.out.println(" Navigated to OrangeHRM Application ");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Validating OrangeHRM Application LogIN Page Title

// Expected Title of the OrangeHRM Application LogIn Page should be - OrangeHRM
String expected_OrangeHRMApplicatinLogInPageTitle="OrangeHRM";
System.out.println(" The expected Title of the OrangeHRM Applicatin LogIn Page is :- "+expected_OrangeHRMApplicatinLogInPageTitle);

// OPeration on the WebPage
String actual_OrangeHRMApplicatinLogInPageTitle=driver.getTitle();
System.out.println(" The Actual Title of the OrangeHRM Applicatin LogIn Page is :- "+actual_OrangeHRMApplicatinLogInPageTitle);

if(actual_OrangeHRMApplicatinLogInPageTitle.equals(expected_OrangeHRMApplicatinLogInPageTitle))
{
System.out.println(" OrangeHRM Application LogIn Page Title Matched - PASS ");
}
else
{
System.out.println(" OrangeHRM Application LogIn Page Title NOT Matched - FAIL  ");
}

System.out.println();
// validating Url Address

// Expected - OrangeHRM Application Url address should have a text orangehrm-4.2.0.1
String expected_OrangeHRMApplicationUrlAddress="orangehrm-4.2.0.1";
System.out.println(" The Expected Url address of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationUrlAddress);

String actual_OrangeHRMApplicationUrlAddress=driver.getCurrentUrl();
System.out.println(" The Actual Url address of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationUrlAddress);

if(actual_OrangeHRMApplicationUrlAddress.contains(expected_OrangeHRMApplicationUrlAddress))
{
System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address Matched - PASS ");
}
else
{
System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address NOT Matched - FAIL ");
}


//  expected text - should be "LOGIN Panel"
String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
System.out.println(" The Expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

// <div id="logInPanelHeading">LOGIN Panel</div>
By logInPanelTextProperty=By.id("logInPanelHeading");
WebElement OrangeHRMApplicationLogInPage_logInPanel=driver.findElement(logInPanelTextProperty);

String actual_OrangeHRMApplicationLogInPage_logInPanelText=OrangeHRMApplicationLogInPage_logInPanel.getText();
System.out.println(" The Actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPage_logInPanelText);

if(actual_OrangeHRMApplicationLogInPage_logInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
{
System.out.println(" OrangeHRM Application LogIn Page Text existing - PASS");
}
else
{
System.out.println(" OrangeHRM Application LogIn Page Text NOT existing - FAIL");
}

// Validating LogIn Functionality

// Automating UserName WebElement
String userNameTestData="rohini"; // Test data - which should be passed to sendKeys method
By userNameProperty=By.id("txtUsername"); // idetifying the property of an element assigned to a variable
// the property of the element should be identified in the WebPage
WebElement userName=driver.findElement(userNameProperty); // WebElement is an interface of Selenium ( which can be treated as a dataType )
// Performing an operation on the identified webElement
userName.sendKeys(userNameTestData);

// Automating Password WebElement
// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

String passwordTestData="Rohiniodugu@12345"; // TestData
By passwordProperty=By.name("txtPassword"); // identify the Property
WebElement password=driver.findElement(passwordProperty); // identify the WebElement
password.sendKeys(passwordTestData); // Operation on WebElement


// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By logInButtonProperty=By.className("button");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();

// Validating OrangeHRM Application HomePage

String expected_OrangeHRMApplicationHomePageText="Welcome";
System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

//By welComeAdminProperty=By.linkText("Welcome Admin");
By welComeAdminProperty=By.id("welcome");
WebElement welComeAdmin=driver.findElement(welComeAdminProperty);

String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);


if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
{
System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");
}
else
{
System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");
}


welComeAdmin.click();

// Synchronization - making the WebDriver to Hault for some duration so that
//                    The Element of the WebPage is going to be Loaded

// Thread.sleep(5000);


// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

By logOutProperty=By.linkText("Logout");
WebElement logOut=driver.findElement(logOutProperty);
logOut.click();

// Validating OrangeHRM Application LogIn Page

// Validating OrangeHRM Application LogIN Page Title

// Expected Title of the OrangeHRM Application LogIn Page should be - OrangeHRM
expected_OrangeHRMApplicatinLogInPageTitle="OrangeHRM";
System.out.println(" The expected Title of the OrangeHRM Applicatin LogIn Page is :- "+expected_OrangeHRMApplicatinLogInPageTitle);

// OPeration on the WebPage
actual_OrangeHRMApplicatinLogInPageTitle=driver.getTitle();
System.out.println(" The Actual Title of the OrangeHRM Applicatin LogIn Page is :- "+actual_OrangeHRMApplicatinLogInPageTitle);

if(actual_OrangeHRMApplicatinLogInPageTitle.equals(expected_OrangeHRMApplicatinLogInPageTitle))
{
System.out.println(" OrangeHRM Application LogIn Page Title Matched - PASS ");
}
else
{
System.out.println(" OrangeHRM Application LogIn Page Title NOT Matched - FAIL  ");
}

System.out.println();
// validating Url Address

// Expected - OrangeHRM Application Url address should have a text orangehrm-4.2.0.1
expected_OrangeHRMApplicationUrlAddress="orangehrm-4.2.0.1";
System.out.println(" The Expected Url address of OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationUrlAddress);

actual_OrangeHRMApplicationUrlAddress=driver.getCurrentUrl();
System.out.println(" The Actual Url address of OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationUrlAddress);

if(actual_OrangeHRMApplicationUrlAddress.contains(expected_OrangeHRMApplicationUrlAddress))
{
System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address Matched - PASS ");
}
else
{
System.out.println(" Successfully Navigated to OrangeHRM Application LogIn Page - Url address NOT Matched - FAIL ");
}


//  expected text - should be "LOGIN Panel"
expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
System.out.println(" The Expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

// <div id="logInPanelHeading">LOGIN Panel</div>
logInPanelTextProperty=By.id("logInPanelHeading");
OrangeHRMApplicationLogInPage_logInPanel=driver.findElement(logInPanelTextProperty);

actual_OrangeHRMApplicationLogInPage_logInPanelText=OrangeHRMApplicationLogInPage_logInPanel.getText();
System.out.println(" The Actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPage_logInPanelText);

if(actual_OrangeHRMApplicationLogInPage_logInPanelText.equals(expected_OrangeHRMApplicationLogInPageText))
{
System.out.println(" OrangeHRM Application LogIn Page Text existing - PASS");
}
else
{
System.out.println(" OrangeHRM Application LogIn Page Text NOT existing - FAIL");
}



driver.quit();

}

}


		
		
	


