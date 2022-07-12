package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytestclass {
  @Test
  public void Mymethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("hii am method is ruuning");
		Reporter.log("hii method is ruuning this is reporter output");
		Reporter.log("hii method is ruuning this is reporter output true",true);
	    Thread.sleep(2000);
	 
	  
  }
  @Test
  public void Mymethod1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	    Thread.sleep(2000);
	 
	  
  }
}
