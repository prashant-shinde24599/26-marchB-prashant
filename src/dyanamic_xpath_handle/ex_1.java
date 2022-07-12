package dyanamic_xpath_handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_1 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    
		    WebElement ip = driver.findElement(By.name("q"));
		    ip.sendKeys("iphone13");
		    Thread.sleep(1000);
		   
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		    Thread.sleep(10000);
		    
		    driver.findElement(By.xpath("(//div[@class='gUuXy-'])[1]")).click();
		    
		   List<WebElement> review = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		   System.out.println(review.size());
		    
              for(WebElement ob:review)
              {
            	  System.out.println(ob.getText());
              }
	}

}
