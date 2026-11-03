package com.demowebshop.genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	XSSFWorkbook workbook; 
	public String readDataFromSpecificCell(String sheetName,int rowNum ,int cellNum) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream
				(FrameWorkConstants.excelFilrPath));
	   String cellData = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	   workbook.close();
	   return cellData;
	 }
	@DataProvider(name = "RegisterDetails")
	public Object getRegisterData() throws FileNotFoundException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(FrameWorkConstants.excelFilrPath));
		XSSFSheet sheet = workbook.getSheet("RegisterUser");
		int rowCount = sheet.getLastRowNum();
		Object[][] data = new Object[rowCount][6];
		DataFormatter formatter = new DataFormatter();
		int count = 0;
		for(int i= 1;i<=rowCount;i++) {
			 Row row = sheet.getRow(i);
			 //check whether row is empty
			 if(row==null ||
					 formatter.formatCellValue(row.getCell(1)).isEmpty()) {
				 continue;
			 }
			 for(int j= 1;)
		}
		
		Object[][] data = new Object[rows][columns];
		DataFormatter formatter = new DataFormatter();
		for(int i=1; i<=rows;i++) {
			for(int j = 1; j<columns;j++) {
				data[i-1][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
        workbook.close();
        return data;
	}
	
}
