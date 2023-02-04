package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://neostox.com/");

	}

}
