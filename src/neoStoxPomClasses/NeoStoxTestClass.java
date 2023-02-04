package neoStoxPomClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			//created object of chromedriver
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://neostox.com/");
			
		   //create an object of Home page 
			
		   NeoStoxHomePage home=new  NeoStoxHomePage(driver);
		   home.clickOnSignInButton();
		   
		   //signIn page
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		   NeoStoxPasswordPage password=new NeoStoxPasswordPage(driver);
		   
		   password.enterPassword();
		   
		   password.clickOnSubmitButton();
		   
		   //dashBoard page
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		   
		   NeoStoxDashBoardPage dashBoard=new NeoStoxDashBoardPage(driver);
		   
		   dashBoard.handlePopUp();
		   
		   dashBoard.validateUserName();
		   
		   dashBoard.logOutFromNeoStox();
		   
		   driver.close();
		   
		   
	

	}

}
