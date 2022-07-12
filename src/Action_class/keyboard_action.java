package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    Thread.sleep(2000);
		
               
		    //find element
		    
		    WebElement textbox = driver.findElement(By.id("autocomplete"));
		    
		    //*how to send key bys using acation class
		    
		    //object create of action classs pass driver object
		    
		    Actions act= new Actions(driver);
		    
		    act.sendKeys(textbox, "good morning").perform();
		    
		    //how to to handle dropdwown by using ation class
		    
		    WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
		    
		    act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
