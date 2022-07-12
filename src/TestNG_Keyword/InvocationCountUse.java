package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
  @Test(invocationCount = 3)     //method run multiple time use
  public void myTest() {
	  Reporter.log("hii",true);
  }
  
  @AfterMethod
  public void test() {
	  Reporter.log("a am prashant",true);
  }
}
