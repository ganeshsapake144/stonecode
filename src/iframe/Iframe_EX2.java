package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_EX2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/");
			
			Thread.sleep(1000);
			driver.switchTo().frame("iframeResult");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(1000);
			
			driver.switchTo().defaultContent();//to switch focus to parent frame
			Thread.sleep(1000);
//			
//			driver.switchTo().
			driver.findElement(By.xpath("//@[@title='change Theme'])[1]")).click();
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
