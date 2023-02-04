package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	  SoftAssert soft= new SoftAssert();
	
	
  @Test
  public void TC1() 
  {
	  String ExpectedResult="VCTCPune";
	  String ActualResult="VCTC";
	  
	  soft.assertEquals(ActualResult,ExpectedResult,"Value is not matching");
	  
	  Reporter.log("TC1 softAssert is Running", true);
	  
	  soft.assertNotNull(ActualResult);
	  Reporter.log("Running TC", true);
	  
	  soft.assertAll();
	
  }
}
