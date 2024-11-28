package SeleniumTricks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.foundit.in/upload");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		TakesScreenshot tc =(TakesScreenshot)driver;
		File file =tc.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("a1.png"));

	}

}
