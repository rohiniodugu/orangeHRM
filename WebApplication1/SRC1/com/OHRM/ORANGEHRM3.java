package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ORANGEHRM3 extends BaseTest {
	//OHRM addemployee _valiidation
	private Object newcell;
	public void addEmployee() throws IOException {
		FileInputStream ExcelTestDataFile=new FileInputStream ("C:\\Users\\DELL\\OneDrive\\Desktop");
		XSSFWorkbook ExcelFileName=new XSSFWorkbook(ExcelTestDataFile);
		
	
		XSSFSheet excelsheet=ExcelFileName.getSheet("sheet1");
		
	Row	row=excelsheet.getRow(1);
	 Cell  cell=row.getCell(0);
	 //getting the expected  test data text from excel
	 String  expected_logintest=cell.getStringCellValue();
	 System.out.println("the expected login page taext is"+expected_logintest);
	 
	// validating login page 
	// <div id="logInPanelHeading">LOGIN Panel</div>
	 

   By loginpanelproperty=By.id("logInPanelHeading");
     WebElement loginpanelelement=driver.findElement(loginpanelproperty);
 
      String  atual_loginpaneltext=loginpanelelement.getText();
      //writting the data into excel sheet 
   Cell  newcell=row.createCell(1);
   newcell.setCellValue( atual_loginpaneltext);
   System.out.println("the actual login page text is :-"+atual_loginpaneltext);
  // vallidating the page using  decision makig  statements
   
     if(atual_loginpaneltext.equals(expected_logintest));
     {
    System.out.println("the navigated page is the expectedpage ");
    row.createCell(2);
    newcell.setCellValue("the text is matched --pass");
    System.out.println("the text is matched --pass");
    //validating the  loginpage  with valid testdata
    
    cell=row.getCell(3);
   String  usernametestdata=cell.getStringCellValue();
   System.out.println("the user name is "+usernametestdata);
   //finding the  element of  username 
   
  
	By userNameProperty=By.id("txtUsername"); 
	WebElement userName=driver.findElement(userNameProperty);
	userName.sendKeys(usernametestdata);
	 
	 cell=row.getCell(4);
	   String  passwordtestdata=cell.getStringCellValue();
	   System.out.println("the user name is "+passwordtestdata);
	   
	   
	 //finding the  element of  username 
		By passwordProperty=By.name("txtPassword"); 
		WebElement password=driver.findElement(passwordProperty); 
		password.sendKeys( passwordtestdata); 
		
		// finding the element of login button
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		
		
		//validatin the home page 
		
		System.out.println("successfully  navigated to  homepage ");
		//getting the  expected  welcome text  from the excel
		cell=row.getCell(5);
		String  expected_homepagetext=cell.getStringCellValue();
		System.out.println("the expected_homepage textis"+expected_homepagetext);
		
		//finding  the  element  welcomeaddmin

		//By welComeAdminProperty=By.id("welcome");
		By welComeAdminProperty= By.linkText("Welcome Admin");
		WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
		String  actual_homepagetext=welComeAdmin.getText();
		System.out.println("the actual_homepagetext is"+ actual_homepagetext);
	    cell=row.createCell(6);
	    cell.setCellValue(actual_homepagetext);
	    if(actual_homepagetext.equals(expected_homepagetext))
	    {
	    //writting the result into the excel
	    	cell=row.createCell(7);
	    	cell.setCellValue("the text is matched---pass");
	    		
	    	
	    	
	    // finding pim element 
	    	  //id="menu_pim_viewPimModule" 	
	    	By pimProperty=By.id("menu_pim_viewPimModule"); 
			WebElement pimelement=driver.findElement(pimProperty);	
		//by using mouse over operation  on pim to find  the element  add employee element 
			Actions mouse= new Actions(driver);
		
			mouse.moveToElement( pimelement).build().perform();
		
		//	now finding the element of employee
			
			
			By addEmpProperty= By.linkText("Add Employee");
			 WebElement addemployee=driver.findElement(addEmpProperty);
			 addemployee.click();
			 //validating  the addd employee page 
			 // getting the expected text text from the excel
			 cell=row.getCell(8);
			 String expected_addemployeepagetext=cell.getStringCellValue();
			 System.out.println("the expected text of add employee page is "+expected_addemployeepagetext);
			 
			// getting the actual text  from the webpage
			 //finding element on the webpage  to get the properties of  the weelement 
			
				By addEmpProperty2= By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
				 WebElement addemployee2=driver.findElement(addEmpProperty);
				String actual_addEmpText= addemployee.getText();
				System.out.println(actual_addEmpText);
				cell=row.createCell(9);
				cell.setCellValue( actual_addEmpText);
				//comparing the  text using the decision making  statements
				
				if(expected_addemployeepagetext.equals(actual_addEmpText)) {
					System.out.println("PASS");
				cell=row.createCell(10);
				cell.setCellValue(" pass");
				
				//getting the test data from the excel sheet
				cell=row.getCell(11);
				String expected_firstname=cell.getStringCellValue();
				System.out.println(" the test data of firstname "+expected_firstname);
				 By firstnameproperty =By.id("firstName");
			  WebElement firstname=driver.findElement(firstnameproperty);
			  firstname.sendKeys( expected_firstname);
				  
				  //getting  the test data  from the excel  for middle name 
			 cell=row.getCell(12);
				String expected_middlename=cell.getStringCellValue();
				System.out.println(" the test data of firstname "+ expected_middlename);
				 By middlenameproperty =By.id("middleName");
			  WebElement middlename=driver.findElement(middlenameproperty);
				middlename.sendKeys( expected_middlename);
					  
				  cell=row.getCell(13);
				String expected_lastname=cell.getStringCellValue();
				System.out.println(" the test data of lastname "+expected_lastname);
				 By lastnameproperty =By.id("lastName");
			  WebElement lastname=driver.findElement(lastnameproperty);
				 lastname.sendKeys(expected_lastname);
				 
				 
				 //finding the employeeid element
				By employeeidproperty =By.id("employeeId");
			  WebElement employeeid=driver.findElement( employeeidproperty );
				  //<input value="0015" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
				 
				 String employeeidvalue=employeeid.getAttribute("value");
				 System.out.println(" the expected value of the employee id is"+ employeeidvalue);
				 
				 //writting  the testdata for employee id  into excel
				 cell=row.createCell(14);
				 cell.setCellValue(employeeidvalue);
				 System.out.println(employeeidvalue);
				 
				 //finding the element  save button
				  By saveproperty =By.id("btnSave");
				  WebElement save =driver.findElement( saveproperty );
				 
				  save.click();
				  
				//  vallidating  the personal detail page 
				//getting the  expected  test data from excel
				  cell=row.getCell(15);
				  String  expected_personaldetaispage=cell.getStringCellValue();
				  
				  //getting the actual data from the webpage
				  
				  By personaldetaisproperty= By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
				  WebElement personaldetails1=driver.findElement(personaldetaisproperty);
				 String actualpersonaldetailstext  =personaldetails1.getText();
				 System.out.println( "the actual text of the personal etail page is" +actualpersonaldetailstext); 
				  cell=row.createCell(16);
				  cell.setCellValue( actualpersonaldetailstext);
				  
				  
				  //vallidating personal detais page
				  if( actualpersonaldetailstext .equals(expected_personaldetaispage));
				  {
					  System.out.println("the text of the personal detail page is ------pass");
					  cell=row.createCell(17);
					  cell.setCellValue( "the test is matched --pass");
					  // getting the actual test  data  of first name  from the webpage 
					  //finding the  element  of first name 
					  By firstnamedetaisproperty= By.id("personal_txtEmpFirstName");
					  WebElement firstnamedetails1=driver.findElement( firstnamedetaisproperty);
					 String firstnamedetailstext  =firstnamedetails1.getAttribute("value");
					 System.out.println( "the actual text of the firstname");
					 cell=row.createCell(18);
					 cell.setCellValue(firstnamedetailstext);
					 System.out.println( expected_firstname);
					 if( expected_firstname.equals(firstnamedetailstext))
					 {
						 System.out.println("pass");
						 cell=row.createCell(19);
						 setCellValue("employeeid is firstname is matched pass");
					 }
					 else {
						 System.out.println("fail");
						 cell=row.createCell(19);
						 setCellValue("employeeid is firstname is matched  not fail");
						 
					 }
					 
					 By middlenamedetaisproperty= By.id("personal_txtEmpMiddleName");
					  WebElement middlenamedetails1=driver.findElement( middlenamedetaisproperty);
					 String middlenamedetailstext  =middlenamedetails1.getAttribute("value");
					 System.out.println( "the actual text of the   middlename text of middlename");
					 System.out.println( expected_middlename);
					 cell=row.createCell(20);
					 cell.setCellValue(middlenamedetailstext);

					 if( expected_middlename.equals(middlenamedetailstext))
					 {
						 System.out.println("pass");
						 cell=row.createCell(21);
						 setCellValue("employeeid is middlename is matched pass");
					 }
					 else {
						 System.out.println("fail");
						 cell=row.createCell(21);
						 setCellValue("employeeid is middlename is not  matched fail");
						 
					 }
					 // getting the values from the last name 
					 By lastnamedetaisproperty= By.id("personal_txtEmpLastName");
					  WebElement lastnamedetails1=driver.findElement( lastnamedetaisproperty);
					 String lastnamedetailstext  =lastnamedetails1.getAttribute("value");
					 System.out.println( "the actual text of the   lastname text of lastnamename");
					 
					 System.out.println( expected_lastname);
					 cell=row.createCell(22);
					 cell.setCellValue( lastnamedetailstext);

					 if( expected_lastname.equals(lastnamedetailstext))
					 {
						 System.out.println("pass");
						 cell=row.createCell(23);
						 setCellValue("employeeid is lastname is matched pass");
					 }
					 else {
						 System.out.println("fail");
						 cell=row.createCell(23);
						 setCellValue("employeeid is lastname is not  matched fail");
					 
					 }
					 //getting the values from employeeid  id 
				  
					 
					 By employeeidproperty1= By.id("personal_txtEmployeeId");
					  WebElement employeeiddetails1=driver.findElement(employeeidproperty1 );
					 String employeeidvalue1 =employeeiddetails1.getAttribute("value");
					 cell=row.createCell(24);
					 cell.setCellValue( lastnamedetailstext);
					 
					 System.out.println( "the actual value of empid");
					 System.out.println(employeeidvalue);
					 if( employeeidvalue.equals(employeeidvalue1))
					 {
						 System.out.println("pass");
						 cell=row.createCell(25);
						 setCellValue("employeeid is matched pass");
					 }
					 else {
						 System.out.println("fail");
						 cell=row.createCell(25);
						 setCellValue("employeeid is not matchedis  fail");
					 }
				  }
					 else {
						 System.out.println();
						 cell=row.createCell(25);
						
						 setCellValue("employeeid is not matchedis  fail");
						 
						 
					 }
	    }
	    else {
	    	System.out.println(" the text of the personl  data not matched ----------fail");
	    	cell=row.createCell(17);
	    	
	   	 setCellValue("the test is not matched fail");
	    }
     }
     else {
    	 System.out.println("the text of addemployeepage is  not mantched failed");
    	 cell=row.createCell(10);
	    	
	   cell .setCellValue("the test is not matched fail");
     }
	  By  welcomeadminproperty=By.id("welcome");
	   WebElement welcomeadminelement=driver.findElement(  welcomeadminproperty);
	     
	    welcomeadminelement.click();
	    By  logoutproperty=By.linkText("LOgout");
	  WebElement  logout=driver.findElement(logoutproperty);
	  
	  logout.click();
     }else {
    	 cell=row.createCell(7);
	    	
	   	cell. setCellValue("the test is not matched fail"); 
	   	// getting the  text frrom the excel for invalid credentials
	   	 cell=row.getCell(2);
	   	cell.getStringCellValue();
	   	 System.out.println("the expected text of the login page text");
	   	 //finding the element of invalid  credentials 
	   	 //getting the actual text  from the webpage 
	   	 By  spanmessageproperty=By.id("spanmessage");
	   WebElement	spanmessage=driver.findElement(loginpanelproperty);
	   
	   	String atual_loginpagetext=spanmessage.getText();
	   	 cell=row.createCell(6);
	   	 cell.setCellValue(atual_loginpagetext);
	   	 System.out.println("the actual text of  the loginpage of invalid credentials is "+atual_loginpagetext);
	   	 
	   	 //validating  the text login page for invalid testdata
	   	 if(atual_loginpagetext.equals(Expected_LoginpageText))
	   	 {
	   		 System.out.println("the text at the  login page after login with inavalid credentials  is matched ---pass");
	   		 cell=row.createCell(7);
	   		 cell.setCellValue("the text is not matched ---fail");
	   	 }
	   	 
     else {
    	 System.out.println("the  text at the  login page  after login  with invalid credentials  is not matched----fail");
    	 cell=row.createCell(7);
   		 cell.setCellValue("the text is not matched ---fail");
   	 }
     }
     //getting the  actual text  from  the excel of login page  after the logout
     cell=row.getCell(29);
     String expectedloginpagetext = cell.getStringCellValue();
     System.out.println("the expected  login page after  the  logoutpage is :-"+expectedloginpagetext );
     
     //gettingh the actual  text of login page  after the logout is performed
     //finding the  element  of loginpanel from the wepage 
    By loginpannelproperty=By.id("logininpanelHeading");
    WebElement loginpannelelement=driver.findElement(loginpanelproperty);
    
  String  actual_loginpagetext= loginpannelelement.getText();
    cell=row.createCell(30);
    cell.setCellValue( actual_loginpagetext);
    System.out.println("the actual  loginpage text after the logout is  page is "+actual_loginpagetext);
    if(actual_loginpagetext.equals(expectedloginpagetext))
    {
    	
    	System.out.println("the text  at the login page  after the logout is  matched--pass");
    	
    	   cell=row.createCell(31);
    	   cell.setCellValue("the text is not matched ---pass" );
    }else {

    	System.out.println("the text  at the login page  after the logout is  matched--fail");
    	
    	   cell=row.createCell(31);
    	   cell.setCellValue("the text is not matched ---fail" );
    }
	}
	else {
	System.out.println("the navigated  page is  not the expected page");
	Object row;
	  newcell = row.createcell(2);
	  newcell).setcellvalue("the text is not matched--fail");
	  System.out.println("the text is not matched--fail");
	  
	}
	//saving the excel after the write operations on the sheet
	
	FileOutputStream testoutfile= new FileOutputStream("./SRC1/com/OrangeHRMapplication_logintest1/testdata.xlsx");
	workbook.write(testoutfile);


	   }
	   driver.quit();

	

}
	
	
    	   
     
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	
    
     
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   	
    	 
    	  
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    	 
    	 
    	 
     }}}
				
					
     
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
						 
					 
					 
					 
					  
					 
					 
					 
					 
					  



		
	
					 
					 
					

					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
					  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				 
					  
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
						  
						  
						  

	

			     	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	    	
	    	
	    	
	    
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	 
		
		
		

	
	



