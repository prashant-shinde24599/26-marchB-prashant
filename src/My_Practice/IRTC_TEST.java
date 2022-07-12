package My_Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRTC_TEST {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
		    
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

			Thread.sleep(2000);
//			Alert alt = driver.switchTo().alert();
//			alt.dismiss();
			
			driver.findElement(By.xpath("//input[@role='searchbox'][1]")).sendKeys("PUNE");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@class='ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("KARAD");
			
			Thread.sleep(2000);
			
			WebElement t = driver.findElement(By.xpath("//input[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
			
			t.click();
			
			Thread.sleep(2000);
			t.clear();
			Thread.sleep(2000);
			t.sendKeys(" 12/09/2022");
			
			
	}

}
