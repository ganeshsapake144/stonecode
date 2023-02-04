package neoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNameUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        //created object of chromedriver
 	    WebDriver driver=new ChromeDriver();
 	    driver.manage().window().maximize();
 	    //reading data from excel sheet
 	    File myFile=new File("C:\\Users\\ganes\\eclipse-workspace\\gs.xlsx");
 	    Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet6");
 	    String userID = mysheet.getRow(0).getCell(0).getStringCellValue();
 	    String password = mysheet.getRow(0).getCell(1).getStringCellValue();
 	    String expUN = mysheet.getRow(0).getCell(2).getStringCellValue();
 	    //launch neoStox url
 	    driver.get("https://neostox.com/");
 	    Thread.sleep(1000);
 	    //click on signINButton
 	    driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).sendKeys(userID);
 	    Thread.sleep(1000);
 	    //working on sign In sign page
 	    //1.sending Mobile Number
 	    driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(userID);
 	    //2.clickOn signInButton
 	    driver.findElement(By.id("lnk_signup1")).click();
 	    Thread.sleep(1000);
 	    //working on password page
 	    //1.Entering password
 	    driver.findElement(By.id("txt_accesspin")).sendKeys(password);
 	    //2.clicking on SubmitButton
 	    driver.findElement(By.id("lnk_submitaccesspin")).click();
 	    //working on Home page
 	    //Handling Hidden div popup
 	    Thread.sleep(500);
 	    driver.findElement(By.xpath("//a[text()='OK'])[2]")).click();
 	    driver.findElement(By.xpath("//a[text()='Close'])[5]")).click();
 	    Thread.sleep(1000);
 	    //validating userName
 	    String actualusername = driver.findElement(By.id("lbl_username")).getText();
 	    // String expectedUserName="Hi ganesh sapkale";
 	    
 	    if(actualusername.equals(expUN))
 	    {
 	    	System.out.println("Actual and Expected UserNames are matching ,TC passed");
 	    	
 	    }
 	    else
 	    {
 	    	System.out.println("Actual and Expected UserNames are matching ,TC Failed");
 	    	
 	    }
 	     
 	    //logging out
 	   Thread.sleep(1000);
 	   driver.findElement(By.id("lbl_username")).click();
 	   driver.findElement(By.xpath("//span[text()='Logout']")).click();
 	   driver.close();// closing browser



	}

}
