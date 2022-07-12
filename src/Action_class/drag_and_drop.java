package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
		    Thread.sleep(2000);
		     
		    //find source & destination
	         WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
	         
	         WebElement destination = driver.findElement(By.id("amt8"));
	         
	         //by using action class passing driver drag &drop
	         Actions act=new Actions(driver);
	         
	         act.dragAndDrop(source, destination).perform();

	}

}
