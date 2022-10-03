package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingExample {
	
	public static void main(String[] args) {
		
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
//		XSSFRow Row;
//		XSSFCell Cell;
		FileInputStream inputStream = null;
		
		//crate an object of file class to open file
		
		File excelFile = new File("C:\\Users\\akash.chandel\\Downloads\\TestDataFile.xlsx");
		
		//create an object of fileinputstread to read data from file
		
		try {
			inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Excel-> workbook -> sheet -> row -> cell
		// create object of XSSworkbook to handle xlsx file
		
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		//  to access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		// get total row count
		int ttlRows = ExcelWSheet.getLastRowNum() + 1;
		
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow =0; currentRow<ttlRows; currentRow++) {
			
			for (int currentCell =0; currentCell<ttlCells; currentCell++)
			{
				System.out.println(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.println("\t");
				
			}
			
			System.out.println("\n");
			
		}
		
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	}

}
