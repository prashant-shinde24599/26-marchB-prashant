package Iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Iframe_Identify {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			
			Thread.sleep(2000);
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			Thread.sleep(2000);
			
			File SRC = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String str=RandomString.make(4);
			
			File desti =new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\iframe"+str+".png");
			
			FileHandler.copy(SRC, desti);


	}

}
