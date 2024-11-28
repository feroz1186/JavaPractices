package SeleniumTricks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameswithoutusingSwitch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		//Type1
		WebElement frame=driver.findElement(By.id("singleframe"));
//		driver.switchTo().frame(frame);
//		
//		driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Frame");

	//Type 2 - webdriver wait
		
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	  
	  driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("TestCompletd");
	
		
  	
	}

}
