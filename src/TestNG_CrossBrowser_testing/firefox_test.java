package TestNG_CrossBrowser_testing;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox_test 
{
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.gecko.driver", "F:\\Automation\\Selenium deivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	 
	   
	 
  }
}
