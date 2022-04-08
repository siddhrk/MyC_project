package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile =new FileInputStream("D:\\ExcelSheet_apachepoi\\test1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
//		System.out.println(mysheet.getLastRowNum()); //get 1 >>count as 0,1
//		System.out.println(mysheet.getRow(0).getLastCellNum()); //get 3 >>count as 1,2,3
		
		//another method to get cell and rows
		
		int lastrowno = mysheet.getLastRowNum();
		System.out.println("last row no is "+lastrowno);
		int TotalNoofRows = lastrowno; //1
		
		short lastcellno = mysheet.getRow(0).getLastCellNum();
		System.out.println("last cell no is "+lastcellno);
		int TotalNoofColumns = lastcellno-1; //4
		
		
		for(int i=0;i<=TotalNoofRows;i++) //outer loop >>row
		{
			for(int j=0;j<=TotalNoofColumns;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
		}
		
		

	}

}
