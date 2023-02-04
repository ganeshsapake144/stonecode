package varificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RadioButtonValidation {
  @Test
  public void validateRadioButtonStatus() throws InterruptedException
  {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
      
	  //created object of chromedriver
	 
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  //Launch URL
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  Thread.sleep(3000);
	  
	  WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	  
	  if(radio1.isSelected())
	  {
		  Reporter.log("Radio 1 is selected TC is passed", true);
		  
	  }
	  else {
		  Reporter.log("Radio 1 is not selected TC is failed", true);
		  
	  }
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	  js.executeScript("arguments[0].scrollIntoView(true)", radio1);
	  
	  radio1.click();
	  
	  Assert.assertTrue(radio1.isSelected(),"Radio 1 is not selected TC is Failed");
  }
}
