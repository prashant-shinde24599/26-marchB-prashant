package Iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


import net.bytebuddy.utility.RandomString;

public class Iframe_EX3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			
			Thread.sleep(200);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
			driver.switchTo().frame("frame1");
			WebElement tag = driver.findElement(By.tagName("input"));
			tag.sendKeys("SELENIUM");
			Thread.sleep(1000);
			
			driver.switchTo().defaultContent();
			String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
            System.out.println(text);
            Thread.sleep(1000);
            
            driver.switchTo().frame("frame2");
            WebElement find = driver.findElement(By.id("animals"));
            Select s=new Select(find);
            s.selectByIndex(0);
            Thread.sleep(1000);
            s.selectByValue("babycat");
            Thread.sleep(1000);
            s.selectByVisibleText("Avatar");
            Thread.sleep(1000);
            
            driver.switchTo().parentFrame();
            String text2 = driver.findElement(By.className("breadcrumb-item")).getText();
            System.out.println(text2);
            Thread.sleep(1000);
            
            driver.switchTo().frame("frame1");
            driver.switchTo().frame("frame3");
            driver.findElement(By.id("a")).click();
            Thread.sleep(2000);
            
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String STR=RandomString.make(4);
            File dest =new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\frame1"+STR+".png");
            FileHandler.copy(src, dest);
            
            String url = driver.getCurrentUrl();
            System.out.println(url);
            
	}

}
