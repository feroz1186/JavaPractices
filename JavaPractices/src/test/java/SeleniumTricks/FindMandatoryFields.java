package SeleniumTricks;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindMandatoryFields {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> mandatory =driver.findElements(By.xpath("//form[@class='form-horizontal']//label"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(WebElement element : mandatory)
		{
			Thread.sleep(1000);
			String script = "return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('content');";
			String cont=js.executeScript(script, element).toString();
			if(cont.contains("*"))
			{
				System.out.println(element.getText());
			}
		}
		
		
		
	}

}
