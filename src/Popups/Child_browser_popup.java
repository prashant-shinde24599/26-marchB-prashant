package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
                 
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			
			driver.findElement(By.name("NewWindow")).click();
			
			String mainpageid = driver.getWindowHandle();             // main page id
			System.out.println(mainpageid);
			System.out.println("=============main id=================");
			
			Set<String> allpageid = driver.getWindowHandles();        //all pages id
		    System.out.print(allpageid);
		    System.out.println("============all pages id==============");
		    
		    Iterator<String> it = allpageid.iterator();               //by using iterator traval to multiple window/pages/tab
		    String main = it.next();
		    String child = it.next();
		    System.out.println("===============================");
		    
		    Thread.sleep(2000);
		    driver.switchTo().window(child);                          //switch to focus main page to child page
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.id("the7-search")).sendKeys("SELINIUM");
		    Thread.sleep(2000);
		    driver.manage().window().minimize();
		    Thread.sleep(2000);
		   // driver.close();
            
	        driver.switchTo().window(main);                             //switch to focus child to main page
			driver.findElement(By.name("NewWindow")).click();        
	        WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
	        System.out.println(text.getText());
	        Thread.sleep(2000);
	        driver.close();
	        driver.quit();
	
	}

}
