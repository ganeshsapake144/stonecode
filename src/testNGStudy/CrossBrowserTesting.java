package testNGStudy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	@Parameters("browserName")
	
	
    @Test
  public void cbTesting(String bName)
  {
		WebDriver driver=null;
		
		if(bName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			//created object of chromrdriver
			driver=new ChromeDriver();
		
		}
		else if(bName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\geckodriver.exe");
			
			//created object of firefox driver
			
			driver=new FirefoxDriver();
		}
		
			
			driver.manage().window().maximize();
		
	    	driver.get("https://vctcpune.com/selenium/practice.html");
		
		    
		
		
	
		
		
		
  }
}
