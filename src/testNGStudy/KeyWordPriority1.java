package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWordPriority1 {
  @Test(priority=1)
  public void C() 
  {
	  Reporter.log("C is Running", true);
  }
  @Test(priority=3)
  public void A() 
  {
	  Reporter.log("A is Running", true);
  }
  @Test(priority=2)
  public void B() 
  {
	  Reporter.log("B is Running", true);
  }
  
}
