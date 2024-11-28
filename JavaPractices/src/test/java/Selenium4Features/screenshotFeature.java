package Selenium4Features;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotFeature {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Hello");
		
		File src=driver.findElement(By.name("name")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("logo.png"));
	}

}
