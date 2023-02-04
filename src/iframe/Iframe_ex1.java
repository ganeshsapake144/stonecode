package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex1 {

	public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.w3schools.com/");
			
			Thread.sleep(1000);
			driver.switchTo().frame("iframeResult");
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='button']")).clear();
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
