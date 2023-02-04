package varificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy2 {
	SoftAssert gs=new SoftAssert();
  @Test
  public void myTest1() 
  {
	  String a="abc";
	  
	  String b="abc";
	  
	  SoftAssert gs= new SoftAssert();
	  
	  gs.assertNull(a,"a is not null TC failed");
	  
	  gs.assertNotEquals(a,b,"a and b are equal TC is failed");
	  
	  gs.assertAll();
	  
  }
  @Test
  public void myTest2()
  {
	  boolean a= true;
	  boolean b= false;
	  
	  
	  gs.assertNull(a,"a is not null TC failed");
	  
	  gs.assertNotEquals(a, b,"a and b are equal TC is failed");
	  
	  gs.assertAll();
	  
  }
}
