package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
	
	//by defoult priorty is alphabatical order
	//my priority is seq = z a d
	//by using number line ex--> (priority= -6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6)
  @Test(priority = 5)
  public void d() {
	  Reporter.log("d is running ",true);
  }
  
  @Test(priority = 2)
  public void a() {
	  Reporter.log("a is running ",true);
  }
  @Test(priority = -9)
  public void z() {
	  Reporter.log("z is running ",true);
  }
  
  
}
