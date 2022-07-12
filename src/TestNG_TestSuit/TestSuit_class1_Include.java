package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuit_class1_Include {
	
	//condition include TC2 By XML Level
	//other TC by defoult exclude
	
  @Test
  public void TC1() {
	  Reporter.log("running TC...1",true);
  }
  @Test
  public void TC2() {
	  Reporter.log("running TC...2",true);
  }
  @Test
  public void TC3() {
	  Reporter.log("running TC...3",true);
  }
  @Test
  public void TC4() {
	  Reporter.log("running TC...4",true);
  }

}
