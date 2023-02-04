package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTesting {
  @Test
  public void ValidateUserID() 
  {
	 Reporter.log("ValidateUserID", true);
	 
  }
  @Test
  public void ValidateACBalance() 
  {
	 Reporter.log("ValidateACBalance", true);
	 
  }
  @BeforeMethod
  public void loginTONeostock()
  {
	  Reporter.log("Logged in", true);
	  
  }
  
}
