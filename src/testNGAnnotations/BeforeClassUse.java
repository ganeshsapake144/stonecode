package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeClassUse {
  @Test//TC-->Method
  public void TC1()
  {
	  Reporter.log("TC1 is running", true);
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
  
  @Test //TC-->Method
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
	  
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("beforeClass is running", true);
	  
  }
}
