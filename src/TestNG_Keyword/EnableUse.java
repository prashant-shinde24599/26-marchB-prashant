package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	
	//by defoult enable is true
	//my condition TC "d" not executed
	//ex-->(enabled=false)
	
  @Test
  public void f() {
	  
	  Reporter.log("d is running ",true);
  }
  
  @Test(enabled = false)
  public void d() {
	  
	  Reporter.log("d is running ",true);
  }
  
  @Test()
  public void a() {
	  
	  Reporter.log("a is running ",true);
  }
  
  @Test()
  public void z() {
	  
	  Reporter.log("z is running ",true);
  }
  
}
