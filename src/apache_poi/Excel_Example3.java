package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Example3 {
	// reading whole excel-->static coding

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream myfile =new FileInputStream("D:\\ExcelSheet_apachepoi\\test1.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

		for(int i=0;i<=1;i++) //outer loop >>row 0-1
		{
			for(int j=0;j<=2;j++) //inner loop >>column 0-3
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
		}
			
	}

}
