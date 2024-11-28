package FrameworkPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements idriverFactoryManager {
	
	public WebDriver createDriver()
	{
		return new ChromeDriver();
	}

}
