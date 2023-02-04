package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		//signInButton.click();// by using webelement method
		
		
		//using Actions class
		
		//1.create an object of Action class and pass Webelement object as parameter
		
		
		Actions gs=new Actions(driver);
		
		//2.using one the action class method take required action.
		
		//gs.click(signInButton).perform();
		
		gs.moveToElement(signInButton).click().build().perform();
		
		
				
		
		
		
		

	}

}
