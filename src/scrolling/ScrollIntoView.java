package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//lanuch url
			driver.get("https://en.wikipedia.org/wiki/India");
			Thread.sleep(1000);
			
			// decide where to scroll and store in ref variable
			WebElement Ancient_India = driver.findElement(By.id("Ancient_India"));
			
			//type cast driver object into javaScriptExecuter
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			//call method executeScript
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView(true)",Ancient_India);
			

	}

}
