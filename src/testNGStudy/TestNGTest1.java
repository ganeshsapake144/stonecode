package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGTest1 {
  @Test
  public void a() 
  {
	  Reporter.log("a is running", true);
  }
}
