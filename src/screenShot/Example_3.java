package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example_3 {

	private static File source;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com//");
			
			Thread.sleep(1000);
			
			File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  String str=RandomString.make(3);//to add random string this will avoid overrwriting of file
			  
			  File dest=new File("C:\\Users\\ganes\\Downloads\\sceenshotex1\\fbimage"+str+".png");
			  
			
			FileHandler.copy(source, dest);
			  
			
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
