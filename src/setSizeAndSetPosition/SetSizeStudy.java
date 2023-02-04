package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			
			// how to get default size of browser?
			
			System.out.println(driver.manage().window().getSize());	
			
			Dimension defaultsize = driver.manage().window().getSize();
			
			System.out.println("Default size is"+defaultsize);
			
			// how to set size?
			
			//1.create object dimension class and pass values of width and height
			
			Dimension d= new Dimension(555,400);
			Thread.sleep(1000);
			
			//2.use setsize method and pass dimension class's object as a parameter
			
			driver.manage().window().setSize(d);
			Dimension newsize=driver.manage().window().getSize();
			System.out.println("newsize size is"+newsize);
			
			
			
			
		
		


	}

}
