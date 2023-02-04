package dyanamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException 
	{

		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
	     //created object of chromedriver
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		//lanuch url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		//how may links are on webpage
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("No of links are "+links.size());
		
		// what are those links?
		
		for(WebElement g:links)
		{
			System.out.println(g.getText());
			
		}
		
		


	}

}
