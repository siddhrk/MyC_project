package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Example1 {

	private static final POIFSFileSystem Book2 = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// file path is given and stored file in ref variable
		FileInputStream Book1 = new FileInputStream("D:\\ExcelSheet_apachepoi\\Book1.xlsx");

		String value = WorkbookFactory.create(Book1).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();

		FileInputStream Book2 = new FileInputStream("D:\\ExcelSheet_apachepoi\\Book1.xlsx");
		double value2 = WorkbookFactory.create(Book2).getSheet("sheet1").getRow(0).getCell(2).getNumericCellValue();

		System.out.println("data from excel is " + value);
		System.out.println("date is " + value2);

	}

}
