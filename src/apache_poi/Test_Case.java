package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test_Case {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("D:\\ExcelSheet_apachepoi\\Test Case on login.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

	 

	}
}