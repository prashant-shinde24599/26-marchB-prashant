package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class button_use {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		    Thread.sleep(2000);
		    
		  //  WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		    //seleniumButton.click();     //--> using WebElement method
		    
		    // How to click using Actions class
		    // Create object of Actions class and pass driver object
		    
		    Actions act=new Actions(driver);
		    
//		    act.moveToElement(seleniumButton).perform();
//		    act.click();
		    
		   // act.moveToElement(seleniumButton).click().build().perform();
		    
		   // act.click(seleniumButton).perform();
		    
		    
		    //*how to right click (contextclick)by using action class
		    
		    
		    WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		    
		    act.contextClick(rightclick).perform();
		    
		    
		    //*how to double click using action class
		    
		    WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		    act.doubleClick(doubleclick).perform();
		    
		    
		    
		    
		    
	}

}
