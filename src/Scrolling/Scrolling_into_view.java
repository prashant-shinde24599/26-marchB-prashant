package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_into_view {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			WebElement send = driver.findElement(By.name("show-hide"));
			
			JavascriptExecutor e= (JavascriptExecutor)driver;
			e.executeScript("arguments[0].scrollIntoView(true)", send);
			
			send.sendKeys("Akash");
			
			
			
			
		

	}

}
