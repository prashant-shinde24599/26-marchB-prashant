package Kite_Testing_Normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1_ex {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
		
			WebElement userid = driver.findElement(By.id("userid"));
			WebElement passward = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userid.sendKeys("ELR321");
			passward.sendKeys("Dhana1111");
			login.click();
			
			Thread.sleep(1000);
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continueBotton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys("982278");
			continueBotton.click();
		    Thread.sleep(1000);
		    
		    WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
		    
		    String actualUserID = username.getText();
		    String expectedUserID = "ELR321";
		    
		    if(actualUserID.equals(expectedUserID))
		    {
		    	System.out.println("User ID matching Tc is PASSED");
		    }
		    else
		    {
		    	System.out.println("User ID not matching Tc is FAILED");
		    }
		    
		    username.click();
		    Thread.sleep(100);
		    
		    driver.findElement(By.xpath("//a[@target='_self']")).click();
		    Thread.sleep(2000);
		    
		    driver.quit();

	}

}
