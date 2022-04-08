package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Example2 {
	//reading single row--> static coding
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream myfile =new FileInputStream("D:\\ExcelSheet_apachepoi\\test1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 
 for(int i=0;i<=2;i++) 
 {
	 String value = mysheet.getRow(0).getCell(i).getStringCellValue();
	 System.out.println(value);
	
 }
	}

}
