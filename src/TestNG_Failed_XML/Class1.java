package TestNG_Failed_XML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
       
	 // TC1 & TC3 failed
	 @Test
	  public void TC1() {
		  Assert.fail();
		  Reporter.log("running TC...1",true);
	  }
	 
	  @Test
	  public void TC2() {
		  Reporter.log("running TC...2",true);
	  }
	  
	  @Test
	  public void TC3() {
		  Assert.fail();
		  Reporter.log("running TC...3",true);
	  }
	  
	  @Test
	  public void TC4() {
		  Reporter.log("running TC...4",true);
	  }
}
