package Listeners_Study;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Listeners_Study.Listener.class)
public class MY_test_class {
	
  @Test
  public void MyMethod1() {
	  
	  Reporter.log("Hi i am Mymethod1 ",true);
	 
  }
  
  @Test
  public void MyMethod2() {
	  
	  Assert.fail();
	  Reporter.log("Hi i am Mymethod2 ",true);
  }
  
  @Test(dependsOnMethods = {"MyMethod2"})
  public void MyMethod3() {
	  
	  Reporter.log("Hi i am Mymethod3 ",true);
  }
}
