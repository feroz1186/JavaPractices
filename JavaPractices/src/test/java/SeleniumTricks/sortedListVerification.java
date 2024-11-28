package SeleniumTricks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortedListVerification {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		List<String> original = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select sel = new Select(driver.findElement(By.id("animals")));
		for(WebElement ele : sel.getOptions())
		{
			System.out.println(ele.getText());
			original.add(ele.getText());
			temp.add(ele.getText());
		}
		
		//Before sort
		System.out.println("Original : "+original);
		System.out.println("Temp : "+temp);
		
		Collections.sort(temp);
		
		if(original.equals(temp))
		{
			System.out.println("Sorted...");
		}
		else
		{
			System.out.println("Not sorted..");
		}
		
	}

}
