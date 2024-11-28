package FrameworkPgms;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public idriverFactoryManager getBrowser(String browserType)
	{
		if(browserType==null)
		{
			return null;
		}
		if(browserType.equalsIgnoreCase("chrome"))
		{
			return new ChromeDriverFactory();
		}
		else if(browserType.equalsIgnoreCase("Edge"))
		{
			return new EdgeDriverFactory();
		}
		else
		{
			return null;
		}
	}

}
