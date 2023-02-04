package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException
	{
        
System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.create an object actions class and pass webdriver object as a argument
		
		Actions gs=new Actions(driver);
		
		//2.find the element and store in ref variable
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[@ondblclick='bu']"));
		
		//3.using actions class method , take required action
		
		gs.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		
		
		
		
		
		
		


	}

}
