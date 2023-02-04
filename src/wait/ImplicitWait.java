package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
          

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//lanuch url
			driver.get("https://en.wikipedia.org/wiki/India");
			Thread.sleep(1000);
			// ImplicitWait-->applicable for whole webpage
			
			driver.findElement(By.xpath("//span[text()='Main page']")).click();
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
			

	}

}