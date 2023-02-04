package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=5)
  
  public void myTest() 
  {
	  Reporter.log("myTest is running", true);
	  
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("beforeMethod is running", true);
	  
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("afterMethod is running", true);
	  
  }
  
}
