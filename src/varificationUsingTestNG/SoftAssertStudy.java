package varificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  @Test
  public void myTest1() 
  {
	  String a="abc";
	  
	  String b="abc";
	  
	  SoftAssert gs= new SoftAssert();
	  
	  gs.assertNull(a,"a is not null TC failed");
	  
	  gs.assertNotEquals(a,b,"a and b are equal TC is failed");
	  
	  gs.assertAll();
	  
//	  Assert.assertNull(a,"a is not null TC is failed");
//	  
//	  Assert.assertNotEquals(a,b,"a a and b are equal TC is failed");
//	  
	  
	  
  }
}
