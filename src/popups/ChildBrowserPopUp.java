package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {



	

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		//created object of chromedriver
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.name("NewWindow")).click();
		  
		 String mainPageID=driver.getWindowHandle();//will return only ID of main page
		 
		 System.out.println("Main page id"+mainPageID);
		 
		 //to get multiple(all pages IDs use method getWindowHandles-->will return set of string)
		 
		 Set<String> idsOfAllPages = driver.getWindowHandles();
		 
		  Iterator<String> it = idsOfAllPages.iterator();
		  
		  String mainPageIDnew=it.next();//ID of main page
		  System.out.println(mainPageIDnew);
		  
		  String childPageID=it.next();//ID of child page 
		  
		  // need to switch selenium focus main page to childpage
		  
		  driver.switchTo().window(childPageID);//focus switched to child page
		  
		  driver.manage().window().maximize();
	  
		  //writting text in child textbox 
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("the7-search")).sendKeys("ganesh sapkale");
		  driver.close();
		  //driver.quit();
		  
		  //to work back to main page-->we need to switch selenium focus from child page to main page
		  driver.switchTo().window(mainPageIDnew);// switching focus from child page tomain page
		  Thread.sleep(1000);
		  String myText=driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
		  
		  System.out.println("text on main page is "+myText);
		  
		  
		  
		  
		  
		  
		  
	  
		  
		 
		  
		  
				 
		  

		 
 
		
	    
		 
		 
	
		
		
		
		

	}

}
