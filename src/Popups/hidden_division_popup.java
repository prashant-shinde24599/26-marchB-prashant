package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        
			Thread.sleep(1000);
			driver.findElement(By.name("q")).sendKeys("iphone 13");
			
			Thread.sleep(1000);
			driver.findElement(By.className("L0Z3Pu")).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
