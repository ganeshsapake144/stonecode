package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException 
	{

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		System.out.println(driver.manage().window().getPosition());
		
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println("default position is"+defaultPosition);
		
		//how to set position?
		
		//1.create an object of point class and pass x and y co-ordinates
		
		Point p= new Point(200,100);
		
		//2. use setPosition and pass point class object as a parameter
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		
		
	
		 
		
		
		 
		

	}

}
