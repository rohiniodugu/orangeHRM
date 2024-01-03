package com.webtable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTable_capturingFirstColumnData_citynames extends BaseTest {
	
public void capturingFirstColumnData_citynames() 
{
	System.out.println("getting the firstcolumndata");
	



	/*//first row of first cell property
	
	/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
   	/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
   			
   	//last row of the first cell property			
	/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]	*/
	//String xpathExpressionpart1="/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	//String xpathExpressionpart2="]/td[1]";
	for(int rowindex=1;rowindex<36;rowindex++)
	{
		
		//BY citynameproperty=BY.xpath("html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
		//or
		By citynameproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	 WebElement cityname=driver.findElement(citynameproperty);
	  String cityname_text=cityname.getText();
	  System.out.println(cityname_text);
	  
	  
		
	}
	
	
}
	public static void main(String[] args) throws IOException {
		WebTable_capturingFirstColumnData_citynames  webtable=new  WebTable_capturingFirstColumnData_citynames();
		webtable.applicationLaunch();
	
		webtable.capturingFirstColumnData_citynames();
		webtable.aPPlicationClose();

	
	
	}
}
