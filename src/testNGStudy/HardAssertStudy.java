package testNGStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test(enabled=false)
  public void TC1()
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  
	  Assert.assertEquals(ActualResult,ExpectedResult,"Result is not matching");
	  Reporter.log("TC1 is Running", true); 
  }
  @Test(enabled=false)
  public void TC2()
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  
	  Assert.assertEquals(ActualResult,ExpectedResult,"Result is matching");
	  Reporter.log("TC2 is Running", true);
	  
  }
  @Test(enabled=false)
  public void TC3()
  {
	  //boolean output=Title.isDisplayed();
	  boolean Result=false;
	  
	  Assert.assertTrue(Result,"Result is false");
	  Reporter.log("TC3 is Running", true);
	 
  }
  @Test(enabled=false)
  public void TC4()
  {
	 // boolean output=Title.isDisplayed();
	  boolean Result=true;
	  
	  Assert.assertFalse(Result,"Result is true");
	  Reporter.log("TC4 is Running", true);
  }
  @Test(enabled=false)
  public void TC5()
  {
	   String str=null;
	  
	  Assert.assertNull(str, "value is not null");
	  Reporter.log("TC5 is Running", true);
  }
  @Test(enabled=false)
  public void TC6()
  {
	   String str="ABC";
	  
	  Assert.assertNotNull(str, "value is null");
	  Reporter.log("TC6 is Running", true);
	  
  }
  @Test
  public void TC7()
  {
	  Reporter.log("Assert fail Check", true);
	  Assert.fail();
	  Reporter.log("TC7 is Running", true);
	  
  }
  
	 
	 
  
}
