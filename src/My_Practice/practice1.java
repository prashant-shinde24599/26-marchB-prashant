package My_Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			Thread.sleep(2000);
			
			//scroll into view
			WebElement calender = driver.findElement(By.xpath("//input[@list='mah-district']"));
			JavascriptExecutor E= (JavascriptExecutor)driver;
			E.executeScript("arguments[0].scrollIntoView(true)", calender);
			calender.sendKeys("Pune");
			
			//scroll by normal use
			Thread.sleep(4000);
			WebElement button = driver.findElement(By.xpath("//input[@value='Radio2']"));
			E.executeScript("window.scrollBy(80,500)");
			button.click();
			
			//table reading
			Thread.sleep(2000);
			List<WebElement> tableread = driver.findElements(By.xpath("//table//tr"));
			Iterator<WebElement> it = tableread.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next().getText()+" ");
				System.out.println();
			}
			
			//dropdown handling
			WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
			Select s=new Select(listbox);
			s.selectByIndex(2);
			
			
			//action class element handling
			WebElement entername = driver.findElement(By.xpath("//input[@name='enter-name']"));
			Actions act=new Actions(driver);
			act.sendKeys(entername, "Prashant").perform();
			
			//screenshot use randomString
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String STR = RandomString.make(3);
			File destination = new File("F:\\Automation\\Selenium deivers\\Screenshot_use_selenium_\\MYpractice_Ex"+STR+".png");
			FileHandler.copy(source, destination);
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			

	}

}
