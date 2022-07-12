package My_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Iframe_EX1 {

	public static void main(String[] args) throws InterruptedException, IOException {
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
	        Thread.sleep(4000);
	        
	        File src = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String abc=RandomString.make(3);
	        File dest=new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\Iframe"+abc+".png");
	        FileHandler.copy(src, dest);
	        
	        Thread.sleep(2000);
	        String title = driver.getTitle();
	        System.out.println(title);
	        
	        Thread.sleep(2000);
	        String url = driver.getCurrentUrl();
	        System.out.println(url);
            
	        Thread.sleep(2000);
	        driver.close();
	}

}
