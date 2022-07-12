package Listeners_Study;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listeners_Study.Listener.class)
public class MY_test_class_2 {
	
  @Test
  public void MyMethod4() {
	  
	  Reporter.log("Hi i am Mymethod4 ",true);
	 
  }
  
  @Test
  public void MyMethod5() {
	  
	  Assert.fail();
	  Reporter.log("Hi i am Mymethod5 ",true);
  }
  
  @Test(dependsOnMethods = {"MyMethod5"})
  public void MyMethod6() {
	  
	  Reporter.log("Hi i am Mymethod6 ",true);
  }
}
