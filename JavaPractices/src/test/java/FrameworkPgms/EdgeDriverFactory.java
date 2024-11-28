package FrameworkPgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverFactory implements idriverFactoryManager {
	
	@Override
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		return new EdgeDriver();
	}

}
