package TestNG_Hard_Assert_Varification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_varification {
	
	 @Test
	  public void MyMethod() {
		  
		  
		  // One test cases or method execution of Multiple varification 
		  // then one varification is failed then stop the next or after varification
		  // becouse We use Hard assert
		  // it is a drowback of hard assert
		  // its overcome the soft assert
		 
		  String A="pune";
		  String B="pune";
		  
		  Assert.assertNotEquals(A, B, "A & B value is matching TC is failed");
		  Reporter.log("A & B value is Not matching TC is Paseed",true);
		  
		  Assert.assertNotNull(A, "TC is failed value is null");
		  Reporter.log("Tc is passed value is not null",true);
				  
	  }
	 
	 @Test
	  public void MyMethod1() {
		  
		  
		 
		  String A="pune";
		  String B="pune";
		  
		  Assert.assertEquals(A, B, "A & B value is matching TC is failed");
		  Reporter.log("A & B value is Not matching TC is Paseed",true);
		  
		  Assert.assertNotNull(A, "TC is failed value is null");
		  Reporter.log("Tc is passed value is not null",true);
				  
	  }
}
