package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys("12345");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("00000");
		
		WebElement UN=driver.findElement(By.id("email"));
		
		UN.sendKeys("123456");
		
		Thread.sleep(1000);
		
		UN.clear();
		Thread.sleep(1000);
		
		UN.sendKeys("00000");
		
		Thread.sleep(2000);
		
		 System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());
		 
		String text= driver.findElement(By.xpath("//button[@type='submit']")).getText();
		
		System.out.println("Text is"+text);
		
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
