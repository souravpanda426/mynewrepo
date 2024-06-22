package Stepdefinitions;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonMethods {
	
	
	
	public static String getDataFromExcel(int row,int col) throws EncryptedDocumentException, IOException {
		
		String path = "/Users/sourav/git/repository13/CucuFramework/src/test/java/Stepdefinitions/Testdata/testdata.xlsx";
		FileInputStream fi = new FileInputStream(path);
		Workbook create = WorkbookFactory.create(fi);
		Cell cell = create.getSheet("Sheet1").getRow(row).getCell(col);
		System.out.println(cell.toString());
		return cell.toString();
		
		
		
	}
	
	public static void updateExistingFile(int index , int col,String [] data) throws EncryptedDocumentException, IOException {
		String path = "/Users/sourav/git/repository13/CucuFramework/src/test/java/Stepdefinitions/Testdata/testdata.xlsx";
		FileInputStream fi = new FileInputStream(path);
		
		Workbook create = WorkbookFactory.create(fi);
		Sheet sheet = create.getSheetAt(index);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		int rowvalue = lastRowNum + 1;
		System.out.println(rowvalue);
		
	
		for (String dataarg : data) {
			
			Row rows = sheet.createRow(rowvalue);
			Cell cell = rows.createCell(col);
			cell.setCellValue(dataarg);
			
			rowvalue++;
			
		}
		
		create.write(new FileOutputStream("/Users/sourav/git/repository13/CucuFramework/src/test/java/Stepdefinitions/Testdata/testdata.xlsx"));
		
		
		
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		CommonMethods.getDataFromExcel(0, 0);
	}
	
	

}
