package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull_use {
  
  @Test
  public void MyMethod() {
	  
	  //*AssertNull-------
	  // TC is passed result is null value
	  
	  String A=null;
	  String B="Pune";
	  
	  Assert.assertNull(A, "Value is not null TC is failed");
	  Reporter.log("value is null tc is Passed",true);
  }
}
