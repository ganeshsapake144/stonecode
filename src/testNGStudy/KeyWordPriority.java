package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWordPriority {
  @Test
  public void C() 
  {
	  Reporter.log("C is Running", true);
	  
  }
  @Test
  public void A() 
  {
	  Reporter.log("A is Running", true);
	  
  }
  @Test
  public void B() 
  {
	  Reporter.log("B is Running", true);
  }
}
