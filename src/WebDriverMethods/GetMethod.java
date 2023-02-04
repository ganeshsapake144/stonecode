package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//1.//get to enter url in browser or to open an application
		
		
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		//2.//close to close the current tab of the browser opened by selenium tool
		driver.close();
		
		//3.quit to close the all the tabs present in browser opened by selenium tool
		driver.quit();
		
		
		//*maximize browser
		
		driver.manage().window().maximize();
		
		//*minimize method
		
		driver.manage().window().minimize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
