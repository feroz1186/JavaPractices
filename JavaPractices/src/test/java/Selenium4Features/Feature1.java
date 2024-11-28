package Selenium4Features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Feature1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/select-menu");
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		WebElement ele1=driver.findElement(RelativeLocator.with(By.id("selectOne")).above(ele));
		ele1.click();
		List<WebElement> els=ele1.findElements(By.tagName("div"));
		
		for(WebElement s:els)
		System.out.println("Test Completed..."+s.getText());
		
	}

}
