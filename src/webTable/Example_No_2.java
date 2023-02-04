package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_No_2 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
	     //created object of chromedriver
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		//lanuch url
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)//1,2
		{
			WebElement header = driver.findElement(By.xpath("//thody//th["+i+"]"));
			System.out.print(header.getText());
		}
		  
		

	}

}
