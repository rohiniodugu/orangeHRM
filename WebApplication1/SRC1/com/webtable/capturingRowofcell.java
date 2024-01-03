package com.webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class capturingRowofcell extends BaseTest {
	public void get_Tabledata() throws IOException
	{
		FileInputStream  loginTestDatafile=new FileInputStream ("./SRC1/com/webtable/rowofcelldata.xlsx");

	      XSSFWorkbook   workbook=new XSSFWorkbook(loginTestDatafile);
	     
	     XSSFSheet  webtabletestdatasheet=workbook.getSheet("rowofcellldata");
	     
	     // int rowscount=logintestdatasheet.getLastRowNum();
	     

	
	for(int rowindex=1;rowindex<=36;rowindex++)
	{
		Row newrow=webtabletestdatasheet.createRow(rowindex-1);
		for(int cellindex=1;cellindex<=8;cellindex++)
		{
			
		//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			
			By citynameproperty=By.xpath("html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+cellindex+"]");
			//By citynameproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+cellindex+"]");
			WebElement cityname=driver.findElement(citynameproperty);
			  String cityname_text=cityname.getText();
			  Cell newcell=newrow.createCell(cellindex-1);
			   newcell.setCellValue(cityname_text);
			  System.out.println("   "+ cityname_text);
			  
		  	
		}
		System.out.println();
	}
	FileOutputStream dataoutput= new FileOutputStream("./SRC1/com/webtable/rowofcelldata.xlsx");
	workbook.write(dataoutput);
	}
	
			
	
			
	public void applicationclose()
	{
		driver.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		capturingRowofcell  webtable= new capturingRowofcell();
		webtable.applicationLaunch();
		webtable.get_Tabledata();
		webtable.applicationclose();

		
	

	}

}
