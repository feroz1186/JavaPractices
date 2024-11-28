package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
	//	option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		
        //old select control
		//WebElement a=driver.findElement(By.id("oldSelectMenu"));
		
		//new select control
		WebElement a=driver.findElement(By.id("selectOne"));
		a.click();
		
		List<WebElement> op=driver.findElements(By.xpath("//div[2]/div/div/div[2]/div"));
		System.out.println(op.size());
		for(WebElement ele: op) {
			if(ele.getText().equals("Prof."))
			{	
			ele.click();
			}
		}
		
	/*	Select dropdown = new Select(a);
		
		for(WebElement opt: dropdown.getOptions())
		{
			System.out.println(opt.getText());
		}*/
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN);
		act.keyUp(Keys.ARROW_DOWN);
		act.keyDown(Keys.ARROW_DOWN);
		act.keyUp(Keys.ARROW_DOWN);
		
		
		System.out.println("End of testing");
		
		//driver.quit();
	}

}
