package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String out=null;
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.nyse.com/ipo-center/recent-ipo");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.findElement(By.xpath("//button[text()='30']")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@data-testid='largest-10']/tbody/tr"));
	//	List<WebElement> cols=driver.findElements(By.xpath("//table[@data-testid='largest-10']/tbody/tr[1]/td"));
		
		System.out.println("Rows : "+rows.size());
		
		for(WebElement row:rows)
		{
			if(row.getText().contains("WeRide"))
			{
				System.out.println(row.getText());
				List<WebElement> cells = row.findElements(By.tagName("td"));
				for(WebElement cell:cells)
				{
					System.out.println(cell.getText());
				}
			}
		}
			
		}
		
//		for(WebElement row : rows)
//		{
//			if(row.getText().contains("Healthcare"));
//				{
//				System.out.println(row.getText());
//				List<WebElement> cells = row.findElements(By.tagName("td"));
//				for(WebElement cell:cells)
//				{
//					System.out.println(cell.getText());
//				}
//				break;
//				}
//				
//		}
		
		
		
	
		

	}


