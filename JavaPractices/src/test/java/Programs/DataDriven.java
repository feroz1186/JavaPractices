package Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\FEROZ\\TestData\\UserDetails.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		
		int a=w1.getSheet("Sheet1").getLastRowNum();
		int b=w1.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println("LastRow : "+a+" Last col :"+b);
		for(int i=1;i<=a;i++)
		{
			//for(int j=0;j<b;j++)
			//{
				String Username=w1.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
				String Password=w1.getSheet("Sheet1").getRow(i).getCell(5).getStringCellValue();
				System.out.println("Uname : "+Username+" Pwd : "+Password);
			//}
	    }
	}

}
