package SeleniumTricks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	public static void main(String[] args) {
		String cpu="";
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//find number of rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        for(int i=1;i<=rows.size();i++)
        {
        	WebElement element=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td["+i+"]"));
        	if(element.getText().equals("Chrome"))
        	{
        		cpu=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
        		break;
        	}
        }System.out.println("CPU Value for chrome is : "+cpu);
       // driver.quit();
	}

}
