package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNull_use {
	

	 @Test
	  public void MyMethod() {
		  
		  //*AssertNull-------
		  // TC is passed result is Not null value
		  
		  String A=null;
		  String B="Pune";
		  
		  Assert.assertNotNull(B, "Value is null TC is failed");
		  Reporter.log("value is not null tc is Passed",true);

}}
