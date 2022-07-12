package Logical_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    Thread.sleep(2000);
		     
		    
		    List<WebElement> link = driver.findElements(By.tagName("a"));
		    
		    System.out.println(link.size());
		    
		    Iterator<WebElement> It = link.iterator();
		    while(It.hasNext())
		    {
		    	System.out.println(It.next().getText());
		    }
		    
		    
	}

}
