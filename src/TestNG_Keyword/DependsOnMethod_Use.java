package TestNG_Keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod_Use {
	
	//1 tc depends on multiple or 1 tc case we need to use "dependsOnmethod" keyword
	//condition TC "a" depends on "d"
	// then 1 st executed "d" or follow the alphabatical order then execute Tc "A"
	//EX-->"(dependsonmethod={"d"}
	
	@Test
	  public void v() {
		  
		  Reporter.log("v is running ",true);
	  }
	  
	 @Test
	  public void d() {
		  Assert.fail();
		  Reporter.log("d is running ",true);
	  }
	  
	  @Test(dependsOnMethods = {"d"})
	  public void a() {
		  
		  Reporter.log("a is running ",true);
	  }
	  
	  @Test
	  public void z() {
		  
		  Reporter.log("z is running ",true);
	  }
	  
}
