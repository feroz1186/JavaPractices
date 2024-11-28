package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testClass {

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
		
		int rows=driver.findElements(By.xpath("//table[@data-testid='largest-10']/tbody/tr")).size();
		int cols=driver.findElements(By.xpath("//table[@data-testid='largest-10']/tbody/tr[1]/td")).size();
		
		System.out.println("Rows : "+rows);
		System.out.println("Cols : "+cols);
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				out=driver.findElement(By.xpath("//table[@data-testid='largest-10']/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(out.equals("Septerna, Inc."))
				System.out.print("|"+out+"|");
			}
			System.out.println("");
		}
		
		driver.quit();
		

	}

}
