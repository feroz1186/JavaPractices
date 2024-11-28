package Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	
		
	FileInputStream fis;
	Workbook wb;
	public Workbook readExcel(String fileName) throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream(fileName);
		wb=WorkbookFactory.create(fis);
		return wb;		
	}
	
	public Sheet getSheet(String sheetName,String fileName) throws EncryptedDocumentException, IOException
	{
		Workbook workbook = readExcel(fileName);
		Sheet sheet=workbook.getSheet(sheetName);
		return sheet;
		
	}
	
	public int getRowCount(String sheetName,String fileName) throws EncryptedDocumentException, IOException
	{
		Sheet sheet=getSheet(sheetName,fileName);
		return sheet.getLastRowNum();
	}
	
	public int getColCount(String sheetName,String fileName) throws EncryptedDocumentException, IOException
	{
		 return getSheet(sheetName,fileName).getRow(1).getLastCellNum();
	}
	
	public Object getData(String sheetName,String fileName,int rownum,int colnum) throws EncryptedDocumentException, IOException
	{
		Object obj=getSheet(sheetName, fileName).getRow(rownum).getCell(colnum);
		return obj;
	}
	
		

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// D:\\FEROZ\\TestData\\UserDetails.xlsx
		
	   ExcelUtility util = new ExcelUtility();
	   ResourceBundle res = ResourceBundle.getBundle("config");
	   String sheet= res.getString("sheetName");
	   String fileName= res.getString("fileName");
	   int rownum= Integer.valueOf(res.getString("rowNum"));
	   int colnum= Integer.valueOf(res.getString("colNum"));
	   int count=util.getRowCount(sheet, fileName);
	   System.out.println("Row count is : "+count);
	   Object ob=util.getData(sheet, fileName, rownum, colnum);
	   System.out.println("Result is : "+ob.toString());
	   
		
		

	}

}
