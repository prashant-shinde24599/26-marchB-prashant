package TestNG_Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_Use {
	
	//condition =declare multiple method one of method is time consuming that case we use timeout keyward 
	//that Tc exceuted within a time otherwise fail TC
	//EX-->(timeOut=2000)
	
  @Test(timeOut = 2000)
  public void VCTPUNE() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
  }
  
  @Test
  public void d() {
	  
	  Reporter.log("d is running ",true);
  }
  
  @Test
  public void a() {
	  
	  Reporter.log("a is running ",true);
  }
  
  @Test
  public void z() {
	  
	  Reporter.log("z is running ",true);
  }
  
}
