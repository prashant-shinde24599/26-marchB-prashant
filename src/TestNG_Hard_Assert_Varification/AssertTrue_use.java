package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue_use {
	
  @Test
  public void MyMethod() {
	  
	  //*AssertTrue------
	  // TC is pass if result is true
	  
	  boolean A=true;
	  boolean B= false;
	  
	  Assert.assertTrue(A, "TC is failed Value is false");
	  Reporter.log("TC is passed value is true",true);
  }
}
