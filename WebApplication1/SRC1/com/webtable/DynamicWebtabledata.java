package com.webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtabledata {


		
		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		public void applicationLaunch()
		{

			System.setProperty("webdriver.chrome.driver","./webDriverFiles/chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println(" ********* Chrome Browser Launched Successfully *********");

	
			driver.get(applicationUrlAddress);
			System.out.println(" Navigated to timeand date application ");

			driver.manage().window().maximize();

			}
		public void _get_Tabledata() throws IOException {
			FileInputStream  loginTestDatafile=new FileInputStream ("C:/Users/DELL/OneDrive/Desktop/WebTableData.xlsx");

		      XSSFWorkbook   workbook=new XSSFWorkbook(loginTestDatafile);
		     
		     XSSFSheet  webtabletestdatasheet=workbook.getSheet("webtabledata");
		    //   /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	//By tablerowproperty=By.xpath("html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]")
		     By tablerowproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
		     List<WebElement> tablerow=driver.findElements(tablerowproperty);
		     int rowcount=tablerow .size();
		     System.out.println(rowcount);
		     
		     By tablecellproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td");
		     List<WebElement> tablecell=driver.findElements(tablecellproperty);
		     int cellcount=tablecell .size();
		     System.out.println(cellcount);
		     for(int indexrow=1;indexrow<=rowcount;indexrow++)
		     {
		    	 Row newrow=webtabletestdatasheet.createRow(indexrow-1);
		    	 for(int indexofcell=1;indexofcell<=cellcount;indexofcell++) { 
 By citynameproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+indexrow+"]/td["+indexofcell+"]");
  WebElement cityname=driver.findElement(citynameproperty);
  String tabledata=cityname.getText();
  
 Cell newcell=newrow.createCell(indexofcell-1);
 
 newcell.setCellValue( tabledata);
 System.out.println(" "+tabledata);

	    	 }
		    System.out.println();	 
		    	 
		     }
		     FileOutputStream dataoutput= new FileOutputStream("./SRC1/com/webtable/webTable1.xlsx");
		 	workbook.write(dataoutput);
		}
		     
		   	     
		public static void main(String[] args) throws IOException {
			DynamicWebtabledata webtable=new DynamicWebtabledata();
			webtable.applicationLaunch();
			webtable._get_Tabledata();
			
	}

}
