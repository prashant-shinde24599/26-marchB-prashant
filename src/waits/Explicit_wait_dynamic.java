package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_dynamic {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");
			
			//explicit waits.     ==>wait only action elemnt
			WebDriverWait waits=new WebDriverWait(driver,Duration.ofMillis(2000));
			
			WebElement element = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
			
			waits.until(ExpectedConditions.visibilityOf(element));
			
			element.click();
			

	}

}
