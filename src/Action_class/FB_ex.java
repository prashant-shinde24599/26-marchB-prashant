package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Create New Account")).click();
	    Thread.sleep(2000);
	    
	    WebElement day = driver.findElement(By.id("day"));
	    
	    Actions act=new Actions(driver);
	    
	    act.click(day).perform();
	    
	    for(int i=0;i<=12;i++)
	    {
	    	act.sendKeys(Keys.ARROW_DOWN).perform();
	    	Thread.sleep(1000);
	    }
        act.sendKeys(Keys.ENTER).perform();
        
        
        
        WebElement name = driver.findElement(By.name("firstname"));
        
        act.keyDown(name, Keys.SHIFT).sendKeys("y").keyUp(Keys.SHIFT).sendKeys("ogesh").build().perform();
	}

}
