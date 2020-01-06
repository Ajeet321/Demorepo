package Frameworks;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFramework {
	public static void main(String[] args) throws Throwable {
	
	FileInputStream fis=new FileInputStream("./data/input.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	Row r = sh.getRow(1);
	Cell c = r.getCell(0);
	String value = c.getStringCellValue();
	System.out.println(value);

	}

}
