package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_ex1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(1000);
			
			File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
			File dest= new File("C:\\Users\\ganes\\Downloads\\sceenshotex1\\fbimage.png");
			
			FileHandler.copy(source, dest);

	}

}
