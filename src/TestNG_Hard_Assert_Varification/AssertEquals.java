package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
	
  @Test
  public void MyMethod() {
	  
	  
	  //if both result are equal then test case is failed
	  
	  String A="pune";
	  String B="pune";
	  
	  Assert.assertEquals(A, B, "A & B value is not matching TC is failed");
	  Reporter.log("A & B value is  matching TC is Paseed",true);
			  
  }
}
