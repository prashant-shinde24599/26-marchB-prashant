package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalse_use {
	
	 @Test
	  public void MyMethod() {
		  
		  //*AssertFalse------
		  // TC is pass if result is false
		  
		  boolean A=true;
		  boolean B= false;
		  
		  Assert.assertFalse(B, "TC is failed Value is false");
		  Reporter.log("TC is passed value is true",true);
	  }

 }
