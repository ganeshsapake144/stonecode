package chromeOptions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) throws InterruptedException
	{
		
		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
         
         ChromeOptions opt=new ChromeOptions();
         
//         opt.addArguments("--headless");
//         opt.addArguments("start-maximized");
//         opt.addArguments("incognito");
//         
//         
         ArrayList<String> al = new ArrayList<>();
         al.add("--start-maximized");
         al.add("incognito");
         
         opt.addArguments(al);
         
         WebDriver driver=new ChromeDriver();
         //driver.manage().window().maximize();
         driver.get("https://jsbin.com/?html,output/osebed/2");
         Thread.sleep(1000);
         
         
         
 		
		
		
		
		

	}

}
