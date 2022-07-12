package TestNG_Failed_XML;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
	
	//TC5 & TC7 is failed
	 @Test
	  public void TC5() {
		  Assert.fail();
		  Reporter.log("running TC...5",true);
	  }
	 
	  @Test
	  public void TC6() {
		  Reporter.log("running TC...6",true);
	  }
	  
	  @Test
	  public void TC7() {
		  Assert.fail();
		  Reporter.log("running TC...7",true);
	  }
	  
	  @Test
	  public void TC8() {
		  Reporter.log("running TC...8",true);
	  }
}
