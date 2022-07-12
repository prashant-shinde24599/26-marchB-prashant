package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			Thread.sleep(1000);
			
			driver.findElement(By.id("alertBox")).click();
			Thread.sleep(1000);
			Alert alt1 = driver.switchTo().alert();
		    System.out.println(alt1.getText());
		    alt1.accept();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("confirmBox")).click();
		    Thread.sleep(1000);
		    Alert alt2 = driver.switchTo().alert();
		    System.out.println(alt2.getText());
		    alt2.dismiss();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("promptBox")).click();
		    Thread.sleep(1000);
		    Alert alt3 = driver.switchTo().alert();
		    System.out.println(alt3.getText());
		    
		    alt3.sendKeys("asas");
		    alt3.dismiss();
		    
		    
		    
		    

	}

}
