package com.OrangeHRMApplicationTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_multipletestdata_valid_invaliddata {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	
		System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println(" ********* Chrome Browser Launched Successfully *********");

		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to OrangeHRM Application ");

		FileInputStream  loginTestDatafile=new FileInputStream ("./SRC1/com/OrangeHRMapplication_logintest1/testdata.xlsx");

		       XSSFWorkbook   workbook=new XSSFWorkbook(loginTestDatafile);
		       
		      XSSFSheet  logintestdatasheet=workbook.getSheet("ohrmlogintestdata");
		      
		       int rowscount=logintestdatasheet.getLastRowNum();
		       
		    for(int rowindex=1;rowindex<=rowscount;rowindex++) 
		    {
		    	 Row row=logintestdatasheet.getRow(rowindex);
		        Cell usernameData =row.getCell(0);
		        String usernametestdata=usernameData.getStringCellValue();
		        
		        Cell passwordData=row.getCell(1);
		        String passwordtestdata=passwordData.getStringCellValue();
		        
		        
		        By userNameProperty=By.id("txtUsername"); 
			    WebElement userNamedata=driver.findElement(userNameProperty);
				userNamedata.sendKeys(usernametestdata);
				
				
				By passwordProperty=By.name("txtPassword"); 
				WebElement password=driver.findElement(passwordProperty); 
				password.sendKeys(passwordtestdata); 
				
				
			By logInButtonProperty=By.className("button");
				WebElement logInButton=driver.findElement(logInButtonProperty);	
				
				logInButton.click();

		
			try {
				
					Cell newrowofnewcell=row.createCell(2);
					 
					 newrowofnewcell.setCellValue("pass");
					 
					
					 
					 //By welComeAdminProperty=By.id("welcome");
					 By welComeAdminProperty= By.linkText("Welcome Admin");
					 WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
					 
					 welComeAdmin.click();
					 
					 Thread.sleep(5000);

					By logOutProperty=By.linkText("Logout");
					WebElement logOut=driver.findElement(logOutProperty);
					logOut.click();
									
			}catch(Exception Fail)
				
				{
				
				 
					Cell newrowofnewcell=row.createCell(2);
					 
					 newrowofnewcell.setCellValue("fail");
					 
					 File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File("./screenshot/InvalidTestData1/testData_For_username_As'"+usernametestdata+"'&password_as'"+passwordtestdata+"'.png"));
					  
				
				 
				}
				
				 FileOutputStream testoutfile= new FileOutputStream("./SRC1/com/OrangeHRMapplication_logintest1/testdata.xlsx");
				 workbook.write(testoutfile);	
	
					
		    }
		    driver.quit();
				
				}
		        
		    
		    }
		    
		    
		
		
		    
		 


		
	


