package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Class1 {
	
	  
	//in class regresssion tc =2
	//sanity tc =1
	//1 tc is other
	 @Test
	  public void TC1() {
		  Reporter.log("running TC...1",true);
	  }
	 
	  @Test(groups = {"Regression"})
	  public void TC2() {
		  Reporter.log("running TC...2",true);
	  }
	  
	  @Test(groups = {"Sanity"} )
	  public void TC3() {
		  Reporter.log("running TC...3",true);
	  }
	  
	  @Test(groups = {"Regression"})
	  public void TC4() {
		  Reporter.log("running TC...4",true);
	  }

}
