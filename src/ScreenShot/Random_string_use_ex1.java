package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Random_string_use_ex1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(2000);
			 
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String STR= RandomString.make(3);
			
			File destination=new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\Screenshot1"+STR+".png");
			
			FileHandler.copy(source, destination);
			

	}

}
