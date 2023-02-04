package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NeoStockUserIDValidation {
  @BeforeClass
  public void LaunchApplication() 
  {
	  Reporter.log("LaunchApplication", true);
	  
  }
  @BeforeMethod
  public void loginToNeoStox()
  {
	  Reporter.log("Loggin Success", true);
  }
  
  @Test //method TC
  public void ValidateUserName()
  {
	  Reporter.log("UserName Validated", true);
	  
  }
  @AfterMethod
  public void logOutFromNeoStox()
  {
	  Reporter.log("Logging out", true);
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("clossing browser", true);
	  
  }
  
}
