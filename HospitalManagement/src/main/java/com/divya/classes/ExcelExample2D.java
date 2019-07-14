package com.divya.classes;

import java.io.File;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample2D {

	public static void main(String[] args) {

		String[][] value= new String[1][1]; 

		try {
			File f = new File(".//src//files//ExampleApachePOI.xlsx");

			Workbook wb = new XSSFWorkbook(f);

			Sheet sheet = wb.getSheet("Sheet1");
			
			for (int i = 0; i < 1; i++) {

				int rows = sheet.getPhysicalNumberOfRows(); // get number of rows from sheet

				int cells = sheet.getRow(i).getPhysicalNumberOfCells(); // get number of cells from row

				value = new String[rows][cells];
				
				for (int r = 0; r < rows; r++) {

					for (int c = 0; c < cells; c++) {
						value[r][c]=sheet.getRow(r).getCell(c).getStringCellValue();
						
						System.out.print(sheet.getRow(r).getCell(c) + "\t");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		for(int i=0;i<value.length;i++) {
			for(int j=0;j<value[i].length;j++) {
				System.out.print(value[i][j]);
			}
			System.out.println();
		}
	}

}