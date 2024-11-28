package SeleniumTricks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsWithoutSwitch {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(1000);
		//Type1
		//driver.switchTo().alert().accept();
		
		//Type2
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
		
		//JavascriptExecutor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.alert=function{};");
		
	}

}
