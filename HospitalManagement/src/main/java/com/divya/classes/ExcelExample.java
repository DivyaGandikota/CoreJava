package com.divya.classes;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample {

	public static void main(String[] args) throws  IOException, Exception {
		
		File f= new File(".//src//files//ExampleApachePOI.xlsx");
		
		System.out.println(f.getAbsoluteFile());
		
		System.out.println(f.exists());
		
		Workbook wb =WorkbookFactory.create(f); // new XSSFWorkbook(f);
			  
		Sheet sheet = wb.getSheet("Sheet1"); // createSheet("Sheet1");
		  
	    Row r = sheet.getRow(0);

	    Cell c = r.getCell(0);
	      
	    System.out.println(c.getStringCellValue());
	    
	}
}
