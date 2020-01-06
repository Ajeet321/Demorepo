package Frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcelhandling {
	 public String getCellData(String path,String sheet,int r,int c) throws Throwable
	{   //for putting the excel sheet in read mode
		FileInputStream fis = new FileInputStream(path);
		//for reading the data
		Workbook wb = WorkbookFactory.create(fis);
		//print 
		String excelvalue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return excelvalue;
	
	}
	public int getRowCount(String sheet,String path) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
	   Workbook wb = WorkbookFactory.create(fis);
	int rc = wb.getSheet(sheet).getLastRowNum();
	return rc;
	
	}
public void setCellData(String path,String sheet,int r,int c,String data) throws Throwable
{
FileInputStream fis=new FileInputStream(path);
Workbook wb=WorkbookFactory.create(fis);
wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
FileOutputStream fos = new FileOutputStream(path);
wb.write(fos);
wb.close();
}
}
