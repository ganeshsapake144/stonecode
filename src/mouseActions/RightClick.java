package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException
	{
	
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.create an object of Actions class and pass Webdriver object as a argument
		
		Actions gs=new Actions(driver);
		
		//find the element and store in ref variable
		WebElement rightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//3. by using one of the Actions class methods take required action 
		
		//gs.moveToElement(rightClickButton).contextClick().build().perform();
		
		gs.contextClick(rightClickButton).perform();
		
		

	}

}
