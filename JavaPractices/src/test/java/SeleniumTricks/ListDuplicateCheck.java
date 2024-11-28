package SeleniumTricks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListDuplicateCheck {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
	    Set<String> set = new HashSet<>();
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select sel = new Select(driver.findElement(By.id("colors")));
		for(WebElement ele : sel.getOptions())
		{			
			if(!set.add(ele.getText()));{
			System.out.println(ele.getText());
		    break;
			}
		}
		
		
		
	}

}
