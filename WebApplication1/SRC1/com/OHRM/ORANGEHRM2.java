package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ORANGEHRM2 extends ORANGEHRM
{



	public void applicationlogin() {      
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
	
	
	String userNameTestData="rohini"; 
	By userNameProperty=By.id("txtUsername"); 
	WebElement userName=driver.findElement(userNameProperty);
	userName.sendKeys(userNameTestData);

	String passwordTestData="Rohiniodugu@12345";
	By passwordProperty=By.name("txtPassword"); 
	WebElement password=driver.findElement(passwordProperty); 
	password.sendKeys(passwordTestData); 




	// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();
	
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>

	///html/body/div[1]/div[2]/ul/li[2]/a/b     
	//.moveToElement("menu_pim_viewPimModule")
	//.moveToElement("menu_pim_Configuration")
	//.moveToElement("menu_pim_viewEmployeeList")
	//.moveToElement("menu_pim_addEmployee")
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewEmployeeList/reset/1" id="menu_pim_viewEmployeeList">Employee List</a>
	Actions action= new Actions(driver);
	action
	.moveToElement(driver.findElement(By.id("menu_pim_viewPimModule")))
	.moveToElement(driver.findElement(By.id("menu_pim_Configuration")))
	.moveToElement(driver.findElement(By.id("menu_pim_viewEmployeeList")))
	.moveToElement(driver.findElement(By.id("menu_pim_addEmployee")))
	.click()
	.build()
	.perform();
	
	
	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>	
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a> 
	String expected_addemployee="Add Employee";
	By addEmpProperty= By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
	driver.findElement(addEmpProperty);
	String addEmpText=driver.findElement(addEmpProperty).getText();
	System.out.println(addEmpText);
	System.out.println(expected_addemployee);
	if(expected_addemployee.equals(addEmpText)) {
		System.out.println("PASS");
	}else {
		System.out.println("FAIL");
	}
	
	//<input class="formInputText validation-error" maxlength="30" type="text" name="firstName" id="firstName">
	String firstnamedata="rohini";
	 By firstnameproperty =By.id("firstName");
	  WebElement firstname=driver.findElement(firstnameproperty);
	  firstname.sendKeys(firstnamedata);
	  //<input value="rohini" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">

	
	//  <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	  String middlenamedata="rohini";
	  By middlenameproperty =By.id("middleName");
	  WebElement middlename=driver.findElement(middlenameproperty);
	  middlename.sendKeys(middlenamedata );
	//<input value="rohini" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">  
	
	 // <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	 
	  String lastnamedata="odugu";
	  By lastnameproperty =By.id("lastName");
	  WebElement lastname=driver.findElement(lastnameproperty);
	  lastname.sendKeys(lastnamedata );
		  
	//  <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
	  
	 
	  By employeeidproperty =By.id("employeeId");
	  WebElement employeeid=driver.findElement( employeeidproperty );
	  //<input value="0015" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
	 
	  String employeeidvalue=employeeid.getAttribute("value");
	  System.out.println(" the expected value of the employee id is"+ employeeidvalue);
		 
	 // <input type="button" class="" id="btnSave" value="Save">
	  By saveproperty =By.id("btnSave");
	  WebElement save =driver.findElement( saveproperty );
	 
	  save.click();
	  ///html/body/div[1]/div[3]/div/div[2]/div[1]/h1
	  String personaldetails="Personal Details"; 
	  By personaldetaisproperty= By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
	  WebElement personaldetails1=driver.findElement(personaldetaisproperty);
	 String actualpersonaldetailstext  =personaldetails1.getText();
	 System.out.println( "the actual text of the personal etail page is" +actualpersonaldetailstext);
	 System.out.println(personaldetails);
	 if(personaldetails.equals(actualpersonaldetailstext))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
		 
	 }
	  ///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[1]/li/ol/li[1]/input
	 
	 
	 
	 
	  By firstnamedetaisproperty= By.id("personal_txtEmpFirstName");
	  WebElement firstnamedetails1=driver.findElement( firstnamedetaisproperty);
	 String firstnamedetailstext  =firstnamedetails1.getAttribute("value");
	 System.out.println( "the actual text of the firstname");
	 System.out.println(firstnamedata);
	 if(firstnamedata.equals(firstnamedetailstext))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 
	 
	 
	 
	 
	 }
	 //<input value="rohini" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	 By middlenamedetaisproperty= By.id("personal_txtEmpMiddleName");
	  WebElement middlenamedetails1=driver.findElement( middlenamedetaisproperty);
	 String middlenamedetailstext  =middlenamedetails1.getAttribute("value");
	 System.out.println( "the actual text of the   middlename text of middlename");
	 System.out.println(middlenamedata);
	 if(middlenamedata.equals(middlenamedetailstext))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 
	 
	 
	 
	 
	 }
	 
	 By lastnamedetaisproperty= By.id("personal_txtEmpLastName");
	  WebElement lastnamedetails1=driver.findElement( lastnamedetaisproperty);
	 String lastnamedetailstext  =lastnamedetails1.getAttribute("value");
	 System.out.println( "the actual text of the   lastname text of middlename");
	 System.out.println(lastnamedata);
	 if(lastnamedata.equals(lastnamedetailstext))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 
	 
	 
	 
	 
	 }//<input value="odugu" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	 
	 
	 By employeeidproperty1= By.id("personal_txtEmployeeId");
	  WebElement employeeiddetails1=driver.findElement(employeeidproperty1 );
	 String employeeidvalue1 =employeeiddetails1.getAttribute("value");
	 System.out.println( "the actual value of empid");
	 System.out.println(employeeidvalue);
	 if(employeeidvalue.equals(employeeidvalue1))
	 {
		 System.out.println("pass");
	 }
	 else {
		 System.out.println("fail");
	 
	 
	 
	 }	 

	 ///html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/ol[2]/li[1]/input
	  
	 // String expected_PersonalDetails="Personal Details";
	  
	  
	}








public static void main(String[] args) {
	

		
ORANGEHRM2 ohrm= new ORANGEHRM2();

ohrm.applicationlaunch();
ohrm.applicationlogin();
//ohrm.applicationclose();

	}
}


