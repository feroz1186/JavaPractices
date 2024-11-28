package FrameworkPgms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="data-driven")
	public Object[][] parameterization()
	{
		return new Object[][] {
			{"hello","feroz"},
			{"hai","Nehru"}
		};
	}
	
	@Test(dataProvider="data-driven")
	public void test(String para1,String para2)
	{
		System.out.println("Para1 is : "+para1+"Para 2 is :"+para2);
	}

}
