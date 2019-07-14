package com.divya.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HospitalTestJarExcel {

    private static final Logger LOGGER = LogManager.getLogger(HospitalTestJarExcel.class.getName());// LoggerExample.testLogger(HospitalManagement.class);

    
	// get file from classpath, resources folder
   /* private File getFileFromResources(String fileName) throws URISyntaxException {

     //   ClassLoader classLoader = getClass().getClassLoader();

        URL resource = getClass().getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.toURI());
        }
    }*/
    
	public static void main(String[] args) throws InvalidFormatException, IOException, URISyntaxException {
//		HospitalTestJarExcel hospital = new HospitalTestJarExcel();
//		File f = hospital.getFileFromResources("resources/Database.xlsx");
//		
	File f = new File("resources/Database.xlsx");
		
		LOGGER.info(f.getAbsolutePath());
		FileInputStream fis = new FileInputStream(f);
		LOGGER.info("JARRRRR");
		
		
  		
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		
//		File f = new File(
//		HospitalManagementTestsApachePOI.class.getClassLoader().getResource("Database.xlsx").getFile()
//	);
	}

}
