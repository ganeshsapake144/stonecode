package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException
	{
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			
			//handle hidden div popoup-->
			//clicking close button of hidden div popup
//			driver.findElement(By.xpath("//button[@class=_'3704LK']")).click();
//		Thread.sleep(1000);
			
			//sending data in search bar button[class='_2KpZ6l _2doB4z']
			
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(1000);
			//sending data in search bar
			driver.findElement(By.name("q")).sendKeys("i phone 14");
			// clicking on search button
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
		driver.findElement(By.xpath("//div[contains(text(), 'Blue, 256')]")).click();
		
			
			
			
			
			

	}

}
