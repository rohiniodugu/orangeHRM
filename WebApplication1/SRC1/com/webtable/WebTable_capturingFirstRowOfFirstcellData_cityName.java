package com.webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_capturingFirstRowOfFirstcellData_cityName   extends BaseTest
{
	public void  capturingFistRowofFirstCellData_cityName() throws IOException {
		
		
	
	/*Locator-xpath
	 selector
	 
		/html/body/div][5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
				xpath is 2 types
				1.RElative
				Absolute-html*/
		
		By citynameproperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		WebElement	cityname=driver.findElement(citynameproperty);
	
	 String citynametext=cityname.getText();
	 System.out.println(citynametext);
	 
	}
	
	public static void main(String[] args) throws IOException {
		
		 WebTable_capturingFirstRowOfFirstcellData_cityName  webtable=new   WebTable_capturingFirstRowOfFirstcellData_cityName();
		 webtable.applicationLaunch();
		 webtable.capturingFistRowofFirstCellData_cityName();
		 webtable.aPPlicationClose();
	}

}
