package com.divya.classes;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExampleHashMap {

	public static void main(String[] args) {

		HashMap<String, String> ex;
		ArrayList<HashMap<String, String>> arraylistex = new ArrayList<HashMap<String, String>>();

		try {

			File f = new File(".//src//files//ExampleApachePOI.xlsx");

			Workbook wb = new XSSFWorkbook(f);

			Sheet sheet = wb.getSheet("Sheet1");

			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				ex = new HashMap<String, String>();

				for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
					String key = sheet.getRow(0).getCell(j).getStringCellValue();
					String value = sheet.getRow(i).getCell(j).getStringCellValue();

					ex.put(key, value); // [{segment,A},{Product,B},{Country,C}] - one HashMap

				}
				arraylistex.add(ex);
			}

			for (int i = 0; i < arraylistex.size(); i++) {
				ex = new HashMap<String, String>();

				ex = arraylistex.get(i); // is a Hashmap

				// display of HashMap key and value
				Iterator<String> itr = ex.keySet().iterator();
				while (itr.hasNext()) {
					String key = itr.next();
					System.out.println(key + "\t" + ex.get(key));
				}

			}
			System.out.println();

		} catch (Exception e) {

		}
	}

}
