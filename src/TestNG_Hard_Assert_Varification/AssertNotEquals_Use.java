package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals_Use {
	@Test
	  public void MyMethod() {
		
		  //*AssertNotEqual---
		  // Actual & expected is matching test case is failed
		
		 String A="Pune1";
		 String B="Pune";
		 
		 Assert.assertNotEquals(A, B,"A & B is matching TC is failed");
		 Reporter.log("A & B is Not matching Tc is Passed",true);
		 
		
	  }
}
