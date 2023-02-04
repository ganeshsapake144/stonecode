package dyanamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderdereList {





	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		//lanuch url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		System.out.println("No of items in list are"+searchResults.size());
		
		
		
		for(WebElement g:searchResults)
		{
			
			System.out.println(g.getText());
			
		}
		
		
		for(WebElement result:searchResults)//1 to 10 honda list
		{
			String expected="honda amaze";
			
			String actual=result.getText();
			
			
			if(expected.equals(actual))
			{
				System.out.println("Clicking on "+result.getText());
				
				result.click();
				
				break;
				
			}
			
		}
		       
		          Thread.sleep(500);
		          
		          driver.findElement(By.linkText("Images")).click();
		          
		   
		
		
		
		
		
        
            
		
	
		
		
		
		 
		 
		 
		

	}
   
	
}
