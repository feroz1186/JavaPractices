package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgressBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/progress-bar");
		
		driver.findElement(By.id("startStopButton")).click();
		Thread.sleep(Duration.ofSeconds(4));
		driver.findElement(By.id("startStopButton")).click();
		String progress = driver.findElement(By.xpath("//div[@role='progressbar']")).getText();
		
		System.out.println("Progress value is : "+progress);
		WebDriverWait wait = new WebDriverWait(driver, null);
		
		

	}

}
