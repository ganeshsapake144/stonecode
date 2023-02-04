package neoStox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUserName {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://neostox.com/");
		
		Thread.sleep(1000);
		
		 driver.manage().window().maximize();
		 
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//a[text()='Sign In'][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).sendKeys("9923313261");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='lnk_signup1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("txt_accesspin")).sendKeys("0404");
			Thread.sleep(1000);
			driver.findElement(By.id("lnk_submitaccesspin")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		
		    driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		     Thread.sleep(1000);
		     String actualusername = driver.findElement(By.id("lbl_username")).getText();
		     String expectedusername = "hi ganesh sapkale";
		     if(actualusername.equals(expectedusername)) {
		    
		    	 System.out.println("test is passsed");
		    	 
		     }
		     else {
		     
		    	 System.out.println("test is failed");
		    	 
		     }
		     
		    driver.findElement(By.id("lbl_username")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//span[text()='Logout']")).click();
		     
		     
		     
		     driver.close();
		     
		     
		     
		     
		    
		    
			
			
			
			
			
			
			
		 
		
		

	}

}
