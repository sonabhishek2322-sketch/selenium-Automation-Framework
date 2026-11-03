package com.practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		/*1. creat object of file class(Java.io)
		 
		 */
		File file = new File("C:\\Users\\Rohit\\Sonali\\TestData.xlsx");
		//create object of fileinputStream(java io)
		FileInputStream fis = new FileInputStream(file);
		/*Create a object of XSSFWorkBook class(from apache POI
		 * and handle IOException
		 * Help to open a workbook in a excel file*/
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//cell getSheet(String SheetName) to navigate into a particular Sheet
		XSSFSheet sheet = workbook.getSheet("User Details");
		//Cell getRow(int rowNum) to navigate into  a row of specific No
		XSSFRow firstrow = sheet.getRow(0);
		XSSFRow secondrow = sheet.getRow(1);
		XSSFRow thridRow = sheet.getRow(2);
		XSSFRow fourthrow = sheet.getRow(3);
		//cell getcell (int cellnum) to navigate into a specific cell of the row 
		XSSFCell firstcell = firstrow.getCell(0);
		//converting the XSSFcell object to string
		String firstCellData = firstcell.getStringCellValue();
		String secondCellData = firstrow.getCell(1).getStringCellValue();
		String thirdCellData = firstrow.getCell(2).getStringCellValue();
		String fourthCellData = firstrow.getCell(3).getStringCellValue();
		//2nd Row data
		String firstCellData1 = secondrow.getCell(0).toString();
		String secondCellData1 = secondrow.getCell(1).getStringCellValue();
		String thirdCellData1 = secondrow.getCell(2).toString();
		String fourthCellData1 = secondrow.getCell(3).getStringCellValue();
		
		//3rd row data
		String firstCellData2 = thridRow.getCell(0).toString();
		String secondCellData2 = thridRow.getCell(1).getStringCellValue();
		String thirdCellData2 = thridRow.getCell(2).toString();
		String fourthCellData2 = thridRow.getCell(3).getStringCellValue();
		//4th row data
		String firstCellData3 = fourthrow.getCell(0).toString();
		String secondCellData3 = fourthrow.getCell(1).getStringCellValue();
		String thirdCellData3 = fourthrow.getCell(2).toString();
		String fourthCellData3 = fourthrow.getCell(3).getStringCellValue();
		//Printing the data
		System.out.print(firstCellData);
		System.out.print("--> "+firstCellData1);
		System.out.print("     "+firstCellData2);
		System.out.println("     "+firstCellData3);


		System.out.print(secondCellData);
		System.out.print("-->  "+secondCellData1);
		System.out.print("     "+secondCellData2);
		System.out.println("     "+secondCellData3);


		System.out.print(thirdCellData);
		System.out.print("-->  "+thirdCellData1);
		System.out.print("      "+thirdCellData2);
		System.out.println("     "+thirdCellData3);


		System.out.print(fourthCellData);
		System.out.print("     "+fourthCellData1);
		System.out.print("     "+fourthCellData2);
		System.out.println("     "+fourthCellData3);





		workbook.close();
		String cellData11 = secondrow.getCell(0).toString();
		String cellData22 = secondrow.getCell(1).getStringCellValue();
		String cellData33 = secondrow.getCell(0).toString();
		
		
		//Printing the data
		System.out.println(firstCellData);
		workbook.close();
	}

}
