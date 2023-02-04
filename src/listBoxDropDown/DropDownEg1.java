package listBoxDropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		    Thread.sleep(1000);
		    
			
		
		
		
		
		

	}

}
