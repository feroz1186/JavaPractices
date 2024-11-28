package SeleniumTricks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataproviderParallel {

	@Test(dataProvider = "getData")
	public void loginPage(String uname,String pwd) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).clear();
		
	}
	
	@DataProvider(parallel=true, indices= {0,1})
	public Object[][] getData()
	{
		String[][] data = {
				{"hello","feroz"},
				{"what","feroz"},
				{"how","areyou"}
		};
		return data;
	}

}
