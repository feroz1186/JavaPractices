package FrameworkPgms;

import org.openqa.selenium.WebDriver;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverFactory factory = new DriverFactory();
		idriverFactoryManager manager= factory.getBrowser("chrome");
		WebDriver driver=manager.createDriver();
        
        driver.get("https://www.nyse.com/ipo-center/recent-ipo");

	}

}
