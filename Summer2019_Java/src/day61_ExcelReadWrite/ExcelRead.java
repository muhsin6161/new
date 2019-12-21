package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

public static void main(String[] args) throws Exception {
	
	String filePath="/Users/mmutlu/Desktop/Book2.xlsx";
	
	
	String sheetname = "Sheet1";  // Name of the sheet
    
    FileInputStream file = new FileInputStream(filePath); // reads a file
    
    Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
  //  XSSFWorkbook=excelFile=new XSSFWorkbook(file);samething with workbook
    Sheet sheet =  excelFile.getSheet(sheetname);  // gets the specific spread sheet from excelfile
    
    Cell cell = sheet.getRow(1).getCell(0); // retrives specific cell from the speardsheet
    
    String cellData = cell.toString();  // veya toString() kullalir;converts the cell' value to STring data type
    
    System.out.println(cellData);
	
	
	
	
	
	
	
}




}
