package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel3 {
  @Test
  public void VCTCLaunch() throws InterruptedException 
  {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		Reporter.log("VCTC Launched", true);
		Thread.sleep(2000);
		driver.close();
		
		
	  
  }
}
