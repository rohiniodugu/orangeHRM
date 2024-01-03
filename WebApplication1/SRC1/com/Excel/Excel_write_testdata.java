package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_testdata {

	

	public static void main(String[]arg) throws IOException{
		//identify  the file (Excel) in the systInputStream exceltestdatafile=new Fileinputstream("./")
				
		FileInputStream  exceltestdatafile=new FileInputStream("./SRC1/singletestdata/testdata.xlsx");
				//identify the  workbook inthe Excel file
				XSSFWorkbook workbook=new XSSFWorkbook(exceltestdatafile);
				//Identify a  paticular sheet in the workbook
				XSSFSheet testdatasheet=workbook.getSheet("Login_testdata");
				//create a row  in the sheet
				Row newRow=testdatasheet.createRow(0);
				//create a row of a cellin the row 
			Cell	newrowofnewcell =newRow.createCell(1);
			//send value into the  Newrow of cell created
			newrowofnewcell.setCellValue("selenium");
			// save the excel file on the system-with the nameof file along the extension of the file
			FileOutputStream testOutputFile=new FileOutputStream("./SRC1/singletestdata/testdata.xlsx");
			
			workbook.write(testOutputFile);
	}

}
 