package TestNG_Soft_Assert_varification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_use {
	
  @Test
  public void MyMethod() {
	  
	  String a="abc";
	  String b="abc";
	  
	  //create the object of SoftAssert class
	  SoftAssert soft = new SoftAssert();
	  soft.assertNotEquals(a, b,"both are equal test case is fail");
	  soft.assertNotNull(a,"value is null tc is fail");
	  soft.assertAll();
  }
  
  @Test
  public void mytest() {
	  boolean a= true;
	  boolean b= false;
	  
	  SoftAssert soft1 = new SoftAssert();
	  soft1.assertTrue(a,"value id false test case fail");
	  soft1.assertFalse(b,"value id true test case fail");
	  soft1.assertAll();
  }
}
