package com.OHRMApplicationTestingTESTNG;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrangeHRMApplication_AddEmployeeTest2 extends BaseTest{

@Test(priority=1,description="Validating OrangeHRM Application LogInPage ")
public void LogInPageValidationTest()
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

}

Row testDataSheetRow;
XSSFWorkbook workBook;

@Test(priority=2,description="Validating OrangeHRM Application LogIn Functionality")
public void LogInTest() throws IOException
{

FileInputStream logInTestDataFile = new FileInputStream("./SRC1/com/OHRMApplicationTestingTESTNG/ohrmtestngexcelfile.xlsx");

workBook = new XSSFWorkbook(logInTestDataFile);

XSSFSheet logInTestDataSheet = workBook.getSheet("sheet1  ");

testDataSheetRow=logInTestDataSheet.getRow(1);

Cell userNameTestDataCell=testDataSheetRow.getCell(4);

String userNameTestData=userNameTestDataCell.getStringCellValue();

System.out.println(" The UserName is :- "+userNameTestData);



// Validating LogIn Functionality

// Automating UserName WebElement
// String userNameTestData="srini"; // Test data - which should be passed to sendKeys method
By userNameProperty=By.id("txtUsername"); // idetifying the property of an element assigned to a variable
// the property of the element should be identified in the WebPage
WebElement userName=driver.findElement(userNameProperty); // WebElement is an interface of Selenium ( which can be treated as a dataType )
// Performing an operation on the identified webElement
userName.sendKeys(userNameTestData);

// Automating Password WebElement
// <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

Cell passwordTestDataCell=testDataSheetRow.getCell(5);
String passwordTestData=passwordTestDataCell.getStringCellValue();
System.out.println(" The Password TestData is :- "+passwordTestData);

// String passwordTestData="Q@Trainer7"; // TestData
By passwordProperty=By.name("txtPassword"); // identify the Property
WebElement password=driver.findElement(passwordProperty); // identify the WebElement
password.sendKeys(passwordTestData); // Operation on WebElement


// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By logInButtonProperty=By.className("button");
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
By welComeAdminProperty=By.id("welcome");
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

 FileOutputStream logInTestResultFile = new FileOutputStream("./SRC1/com/OHRMApplicationTestingTESTNG/ohrmtestngexcelfile.xlsx");
workBook.write(logInTestResultFile);


}

@Test(priority=4,description=" Validating PIM In OrangeHRM Application HOmePage ")
public void pimTest()
{

// id="menu_pim_viewPimModule"
By pimProperty=By.id("menu_pim_viewPimModule");
WebElement pim=driver.findElement(pimProperty);

Actions pimActions = new Actions(driver);
pimActions.moveToElement(pim).build().perform();

}

@Test(priority=5,description=" Validating Add Employee in PIM In OrangeHRM Application HOmePage ")
public void AddEmpoyeeTest()
{

// id="menu_pim_addEmployee"

By addEmployeeProperty=By.id("menu_pim_addEmployee");
WebElement addEmployee=driver.findElement(addEmployeeProperty);
addEmployee.click();
}

@Test(priority=6,description=" Validating New Add Employee webPage in OrangeHRM Application ")
public void addEmployeePageValidationTest()
{
// Validating Add Employee Page
System.out.println(" Validating Add Employee WebPage");
}

@Test(priority=7,description=" Adding New Employee to the Add Emplyee Funcationalty in OrangeHRM Application ")
public void addingNewEmployeeTest() throws InterruptedException, IOException
{

// id="firstName"
By firstNameProperty=By.id("firstName");
WebElement firstName=driver.findElement(firstNameProperty);
firstName.sendKeys("rohini");

// shifting the focus from the FirstName to Middle Name
Actions keyBoardAction = new Actions(driver);
keyBoardAction.sendKeys(Keys.TAB).build().perform();

//without identifying the properties of the MiddleName element directly automating
//    middle name element - since the Actions class Object focus is now at the
//       middleName element - using the same object directly performing the operation
keyBoardAction.sendKeys("rohini").build().perform();

// shifting the focus from the MiddleName to LastName
keyBoardAction.sendKeys(Keys.TAB).build().perform();
// Automating LastName
keyBoardAction.sendKeys("odugu").build().perform();

// shifting to Employee ID
keyBoardAction.sendKeys(Keys.TAB).build().perform();

// shifting to Photograph
keyBoardAction.sendKeys(Keys.TAB).build().perform();

// performing ENTER key of KeyBoard Operation
keyBoardAction.sendKeys(Keys.ENTER).build().perform();

Thread.sleep(10000);

java.lang.Runtime.getRuntime().exec
("C:\\Users\\DELL\\OneDrive\\Desktop\\JavaClass\\WebApplication1\\AutoItScripts\\PhotoGraph.exe");

Thread.sleep(10000);


/*

// id="middleName"
By middleNameProperty=By.id("middleName");
WebElement middleName=driver.findElement(middleNameProperty);
middleName.sendKeys("Nivas009");

// id="lastName"

By lastNameProperty=By.id("lastName");
WebElement lastName=driver.findElement(lastNameProperty);
lastName.sendKeys("Test009");
*/
// id="employeeId"
By employeeIdProperty=By.id("employeeId");
WebElement employeeId=driver.findElement(employeeIdProperty);
String newEmployeeId=employeeId.getAttribute("value");
System.out.println(" The expected New Employee ID is : "+newEmployeeId);

// id="btnSave"
By saveButtonProperty=By.id("btnSave");
WebElement saveButton=driver.findElement(saveButtonProperty);
saveButton.click();


//

}


@Test(priority=8,description="Validating Personal Details WebPage of OrangeHRM Application ")
public void validatingPersonalDetailsPageTest()
{
System.out.println(" Validating Personal Details Web Page ");
}

@Test(priority=9,description="Validating Personal Details WebPage - Add Employee Funcationality of OrangeHRM Application ")
public void validatingAddEmployeeTest()
{

// Validating Image
// id="empPic"
By photographProperty=By.id("empPic");
WebElement employeePhotograph=driver.findElement(photographProperty);


boolean flag=employeePhotograph.isDisplayed();

if(flag)
{
System.out.println(" Employee Photograph Uploaded Successfully - PASS");
}
else
{
System.out.println(" Employee Photograph NOT Uploaded Successfully - FAIL");
}


System.out.println(" Validating New Employee funcationality - FirstName, MiddleName, LastName and EmployeeID ");

}

/*
@Test(priority=10,description=" Validating OrangeHRM Application LogOut Functionality ")
public void LogOutTest()
{
By welComeAdminProperty=By.id("welcome");
welComeAdmin=driver.findElement(welComeAdminProperty);
welComeAdmin.click();

// Synchronization - making the WebDriver to Hault for some duration so that
//                    The Element of the WebPage is going to be Loaded

// Thread.sleep(5000);


// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

By logOutProperty=By.linkText("Logout");
WebElement logOut=driver.findElement(logOutProperty);
logOut.click();

}

*/

}




