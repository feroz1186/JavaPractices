package FrameworkPgms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	@DataProvider(name="data-driven")
	public Object[][] parameterization() throws EncryptedDocumentException, IOException
	{
		return excelUtil();
		
	}
	
	@Test(dataProvider="data-driven")
	public void test(String UserId,String UserName,String FirstName,String LastName,String Email,String Password,String Phone)
	{
		System.out.println("Para1 is : "+UserName+" Para 2 is :"+Password);
	}
	
	public Object[][] excelUtil() throws EncryptedDocumentException, IOException
		{
	      FileInputStream fis = new FileInputStream("D:\\FEROZ\\TestData\\UserDetails.xlsx");
	      Workbook wb=WorkbookFactory.create(fis);
	      int rowcount= wb.getSheetAt(0).getPhysicalNumberOfRows();
	      int colcount =wb.getSheetAt(0).getRow(1).getPhysicalNumberOfCells();
	      
	      Object[][] data = new Object[rowcount-1][colcount];
	      for(int i=1;i<rowcount;i++)
	      {
	    	  Row row = wb.getSheetAt(0).getRow(i);
	    	  for(int j=0;j<colcount;j++)
	    	  {
	    		  Cell cell = row.getCell(j);
	    		  data[i-1][j]=cell.toString();
	    	  }
	      }
		wb.close();
		fis.close();
		return data;
		
	}

}
