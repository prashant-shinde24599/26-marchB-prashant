package Multiple_window_handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/java/");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.linkText("Try it Yourself »")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Try it Yourself »")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Try it Yourself »")).click();
		    
		  String mainpage = driver.getWindowHandle();
		  System.out.println(mainpage);
		  
		  Set<String> allpagesid = driver.getWindowHandles();
		  System.out.println(allpagesid);
           
		  Iterator<String>  it = allpagesid.iterator();
		  String main = it.next();
		  String sub1 = it.next();
		  String sub2 = it.next();
		  String sub3 = it.next();
		  
		    driver.switchTo().window(sub1);
		     Thread.sleep(2000);
		 	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		   	Thread.sleep(2000);
		   	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		    driver.close();
		   	
		    driver.switchTo().window(sub2);
		     Thread.sleep(2000);
		 	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		   	Thread.sleep(2000);
		   	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		    driver.close();
		    
		    driver.switchTo().window(main);
		    Thread.sleep(2000);
		    
		    driver.switchTo().window(sub3);
		     Thread.sleep(2000);
		 	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		   	Thread.sleep(2000);
		   	driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		    driver.close();
		    
		    
		 
	}

}
