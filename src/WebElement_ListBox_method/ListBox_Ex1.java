package WebElement_ListBox_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			
			Thread.sleep(3000);
			WebElement day = driver.findElement(By.id("day"));
			Select s=new Select(day);
			s.selectByVisibleText("24");
			
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select s1=new Select(month);
			s1.selectByIndex(4);
			
			WebElement year = driver.findElement(By.id("year"));
		    Select s2=new Select(year);
		    s2.selectByValue("1999");
					
					
					
					
					
					
					
      
	}

}
