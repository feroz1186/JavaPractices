package SeleniumTricks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNumberOfElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://booksbykilo.in/new-books");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//not working, its not going end of the page
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		List<WebElement> al=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		System.out.println(al.size());
		*/
		Actions act = new Actions(driver);
		JavascriptExecutor js;
		int previouscount=0;
		int currentcount=0;
		while(true)
		{
			List<WebElement> al=driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
			currentcount=al.size();
			
			if(currentcount==previouscount)
			{
				break;
			}
			js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			act.sendKeys(Keys.END).perform();
			Thread.sleep(3000);
			previouscount=currentcount;
			
		}
		System.out.println("Currentcount is : "+currentcount);
		
	}

}
