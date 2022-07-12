package Kite_TestNG_CrossBrowsertesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	
      static WebDriver driver;
       
	public void OpenChromebrowser() throws IOException {
		
		  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get(Utility.GetdataFromPropertyfile("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			

		
	}
	
	public void OpenFirefoxbrowser() throws IOException
	{
		 System.setProperty("webdriver.gecko.driver", "F:\\Automation\\Selenium deivers\\geckodriver.exe");
		 driver=new FirefoxDriver();  
		 driver.manage().window().maximize();
		 driver.get(Utility.GetdataFromPropertyfile("URL"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 	

	}
		
	public  void CaptureScreenshot(String TCID) throws IOException
	{
		File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\My_Frist_testCase"+TCID+".png");
		FileHandler.copy(SRC, dest);
	}
	
	
}
