package com.OHRMApplicationTestingTESTNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

  import org.apache.poi.ss.usermodel.Cell;
   import org.apache.poi.ss.usermodel.Row;
   import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class OrangeHRMApplication_LoginTest extends BaseTest {
	
    FileInputStream propertiesFile;
       Properties properties;
@Test(priority=1,description="Validating OrangeHRM Application LogInPage ")
public void LogInPageValidationTest() throws IOException
{
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

// Identifying the Properties file
propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

properties = new Properties();
properties.load(propertiesFile);

//  expected text - should be "LOGIN Panel"
         String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
            System.out.println(" The Expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);

// <div id="logInPanelHeading">LOGIN Panel</div>
       By logInPanelTextProperty=By.id(properties.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
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

   }

   Row testDataSheetRow;
     XSSFWorkbook workBook;

   @Test(priority=2,description="Validating OrangeHRM Application LogIn Functionality")
     public void LogInTest() throws IOException
         {
      FileInputStream logInTestDataFile = new FileInputStream("./SRC1/com/OHRMApplicationTestingTESTNG/OHRMTESTNG.xlsx.xlsx");

      workBook = new XSSFWorkbook(logInTestDataFile);

       XSSFSheet logInTestDataSheet = workBook.getSheet("OHRMTESTNG");

        testDataSheetRow=logInTestDataSheet.getRow(1);

           Cell userNameTestDataCell=testDataSheetRow.getCell(0);

              String userNameTestData=userNameTestDataCell.getStringCellValue();

            System.out.println(" The UserName is :- "+userNameTestData);



        // Validating LogIn Functionality

       // Automating UserName WebElement
    // String userNameTestData="srini"; // Test data - which should be passed to sendKeys method
      By userNameProperty=By.id(properties.getProperty("orangeHRMApplicationUserProperty")); // idetifying the property of an element assigned to a variable
    // the property of the element should be identified in the WebPage
     WebElement userName=driver.findElement(userNameProperty); // WebElement is an interface of Selenium ( which can be treated as a dataType )
     // Performing an operation on the identified webElement
        userName.sendKeys(userNameTestData);

    // Automating Password WebElement
   // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

    Cell passwordTestDataCell=testDataSheetRow.getCell(1);
       String passwordTestData=passwordTestDataCell.getStringCellValue();
         System.out.println(" The Password TestData is :- "+passwordTestData);

// String passwordTestData="Q@Trainer7"; // TestData
     By passwordProperty=By.name(properties.getProperty("orangeHRMApplicationPasswordProperty")); // identify the Property
      WebElement password=driver.findElement(passwordProperty); // identify the WebElement
      password.sendKeys(passwordTestData); // Operation on WebElement


// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
        By logInButtonProperty=By.className(properties.getProperty("orangeHRMApplicationButtonProperty"));
        WebElement logInButton=driver.findElement(logInButtonProperty);
         logInButton.click();

          }

                 WebElement welComeAdmin;

        @Test(priority=3,description=" Validating OrangeHRM Application HomePage ")
        public void OrangeHRMApplication_HomePageValidationTest() throws IOException
             {
// Validating OrangeHRM Application HomePage

        String expected_OrangeHRMApplicationHomePageText="Welcome";
       System.out.println(" The Expected Text of the OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

//By welComeAdminProperty=By.linkText("Welcome Admin");
            By welComeAdminProperty=By.id(properties.getProperty("orangeHRMApplicationHomPageWelcomeAdminProperty"));
             welComeAdmin=driver.findElement(welComeAdminProperty);

         String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
       System.out.println(" The Actual Text of the OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);


   if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
     {
         System.out.println(" Successfully Navigated to OrangeHRM Application HomePage - PASS");


// Row newRow=logInTestDataSheet.createRow(1); // this will create that row as a fresh - the data already existing will be deleted
//Cell newRowOfNewResultCell=newRow.createCell(2);

// Of the same Existing Row of the Test Data - a new Cell is created to save the Result
             Cell resultCell=testDataSheetRow.createCell(2);


          resultCell.setCellValue("Successfully Navigated to OrangeHRM Application HomePage - PASS");

           }
           else
               {
                System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");

// Of the same Existing Row of the Test Data - a new Cell is created to save the Result
          Cell resultCell=testDataSheetRow.createCell(2);

        resultCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL");
           }

        FileOutputStream logInTestResultFile = new FileOutputStream("./SRC1/com/OHRMApplicationTestingTESTNG/OHRMTESTNG.xlsx.xlsx");
          workBook.write(logInTestResultFile);

    }


       @Test(priority=4,description=" Validating OrangeHRM Application LogOut Functionality ")
      public void LogOutTest() 
    {
    	


         welComeAdmin.click();

// Synchronization - making the WebDriver to Hault for some duration so that
//                    The Element of the WebPage is going to be Loaded

// Thread.sleep(5000);


// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

          By logOutProperty=By.linkText(properties.getProperty("orangeHRMApplicationHomPageLogOutProperty"));
          WebElement logOut=driver.findElement(logOutProperty);
          logOut.click();

      }

      }
