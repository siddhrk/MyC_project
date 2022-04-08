package apache_poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 
		FileInputStream file1=new FileInputStream("D:\\ExcelSheet_apachepoi\\demo1.xlsx");

		 Sheet Mysheet = WorkbookFactory.create(file1).getSheet("Sheet2");
		 int TotalNoofRow = Mysheet.getLastRowNum();
		  int TotalNoofColumn = Mysheet.getRow(0).getLastCellNum()-1;
		  
		  for(int i=0;i<=TotalNoofRow;i++) //outer for loop for Row
		  {
			  for(int j=0;j<=TotalNoofColumn;j++) //inner for loop for Column
			  {
				  Cell info = Mysheet.getRow(i).getCell(j);
				  CellType type = info.getCellType(); //cell type>>string/numeric/boolean
			   
			  if(type==CellType.STRING) 
			  {
				   String value = info.getStringCellValue();
				   System.out.print(value+" ");
			  }
			  else if(type==CellType.NUMERIC)
			  {
				 double value = info.getNumericCellValue(); 
				 System.out.print(value+" ");
			  }
			  else if(type==CellType.BOOLEAN) 
			  {
				  boolean value = info.getBooleanCellValue();
				  System.out.print(value+" ");
			  }
		  }
			  System.out.println();
		  }  
		  
		  
		  
		  
		  
		  
		  
		 
	}

}
