package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_Class2 {
	
	//in class sanity tc =2
	//regression tc=1
	//1 tc is other
	 @Test
	  public void TC5() {
		  Reporter.log("running TC...5",true);
	  }
	 
	  @Test(groups = {"Regression"})
	  public void TC6() {
		  Reporter.log("running TC...6",true);
	  }
	  
	  @Test(groups = {"Sanity"} )
	  public void TC7() {
		  Reporter.log("running TC...7",true);
	  }
	  
	  @Test(groups = {"Sanity"} )
	  public void TC8() {
		  Reporter.log("running TC...8",true);
	  }
}
