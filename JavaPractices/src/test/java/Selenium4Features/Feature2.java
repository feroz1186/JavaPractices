package Selenium4Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feature2 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	//option.addArguments("--headless");
	
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	String parent=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://demoqa.com/select-menu");
    driver.switchTo().window(parent);
    Thread.sleep(Duration.ofSeconds(5));
    driver.findElement(By.name("name")).sendKeys("Hello");
    
    driver.findElement(By.name("name")).sendKeys(Keys.chord(Keys.SHIFT,Keys.ARROW_UP));
   // driver.findElement(By.name("name")).sendKeys(Keys.ARROW_UP);
    
    driver.quit();
}
}
