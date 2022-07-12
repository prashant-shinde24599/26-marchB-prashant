package TestNG_CrossBrowser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_testing {
	
	
  @Parameters("browserName")
  @Test
  public void MyMethod(String name) {
	  
	  WebDriver driver = null;
	  if(name.equals("firefox"))
	  {System.setProperty("webdriver.gecko.driver", "F:\\Automation\\Selenium deivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
	  }
	  
	  else if (name.equals("chrome")) 
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		     driver=new ChromeDriver();       		
	  }
	 		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	 
	   
  }
}
