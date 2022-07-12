package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooling_use_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			JavascriptExecutor e= (JavascriptExecutor)driver;
			e.executeScript("window.scrollBy(80,500)");
			Thread.sleep(2000);
			e.executeScript("window.scrollBy(80,900)");
			Thread.sleep(2000);
			e.executeScript("window.scrollBy(80,2000)");
			Thread.sleep(2000);
			e.executeScript("window.scrollBy(80,-2000)");
			Thread.sleep(2000);
			e.executeScript("window.scrollBy(80,-900)");
			Thread.sleep(2000);
			e.executeScript("window.scrollBy(80,-500)");
			Thread.sleep(2000);
			
			driver.quit();
			
			

	}

}
