package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqual {
  @Test
  public void NotEqual() 
  {
	  String a="abc";
	  String b="abcd";
	  
	  Assert.assertNotEquals(a,b,"a and b is equal,TC is failed");
	  
  }
}
