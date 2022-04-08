package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("D:\\ExcelSheet_apachepoi\\typedata.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

		CellType type1 = mysheet.getRow(0).getCell(0).getCellType();
		CellType type2 = mysheet.getRow(0).getCell(1).getCellType();
		CellType type3 = mysheet.getRow(0).getCell(2).getCellType();
		CellType type4 = mysheet.getRow(0).getCell(3).getCellType();

		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println("==============================================================");

		String value1 = mysheet.getRow(0).getCell(0).getStringCellValue();
		double value2 = mysheet.getRow(0).getCell(1).getNumericCellValue();
		boolean value3 = mysheet.getRow(0).getCell(2).getBooleanCellValue();
		String value4 = mysheet.getRow(0).getCell(3).getStringCellValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		

	}

}
