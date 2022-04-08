package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file2 = new FileInputStream("D:\\ExcelSheet_apachepoi\\demo1.xlsx");
		Sheet MySheet = WorkbookFactory.create(file2).getSheet("Sheet4");

		// System.out.println(MySheet.getLastRowNum());
		int TotalNoofRow = MySheet.getLastRowNum();
		int TotalNoofColumn = MySheet.getRow(0).getLastCellNum() - 1;

	}

}
