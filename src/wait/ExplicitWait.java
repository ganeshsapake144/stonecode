package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.discoveryplus.in/");
			
			//create an object of webDriverWait
			
			WebDriverWait w= new WebDriverWait(driver,Duration.ofMillis(10000));
			
			//using object take next option
			
			w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(null))));
			



	}

}
