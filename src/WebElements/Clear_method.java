package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_method {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
		
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("prashant");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		    Thread.sleep(1000);
		   
             /*  Clear method-use
              *  clear the value in the text field   */

	}

}
