package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_No1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
	     //created object of chromedriver
		WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		
		//lanuch url
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		//how many rows are there in table
		 System.out.println("No of rows are "+table.size());
		 
		 //print table
		 for(WebElement gs:table)
		 {
			 System.out.println(gs.getText());
			 
		 }
		 
		   //how many column /header are there?
		  List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		  
		  System.out.println("Number of coloum are "+header.size());
		  
		  //what are the headers?
		  
		 Iterator<WebElement> gs = header.iterator();
		 while(gs.hasNext())
		 {
			 System.out.println(gs.next().getText());
			 
		 }
		 
		 

	}

}
