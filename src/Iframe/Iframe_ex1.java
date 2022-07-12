package Iframe;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/iframes/");
		    
			String text = driver.findElement(By.linkText("Pavilion")).getText();
			System.out.println(text);
			Thread.sleep(2000);
			
			driver.switchTo().frame("Framename1");
			String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
            System.out.println(text1);
            Thread.sleep(2000);
            
            driver.switchTo().parentFrame();
            String text2 = driver.findElement(By.linkText("Blogger")).getText();
			System.out.println(text2);
			Thread.sleep(2000);
			
			driver.switchTo().frame(1);
			String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
			System.out.println(text3);
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			String text4 = driver.findElement(By.linkText("Pavilion")).getText();
			System.out.println(text4);
	        Thread.sleep(2000);
	        
	        
	
	}

}
