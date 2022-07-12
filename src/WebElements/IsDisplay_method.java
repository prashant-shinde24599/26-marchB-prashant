package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_method {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		
			Thread.sleep(3000);
			WebElement hide = driver.findElement(By.id("hide-textbox"));
            WebElement show = driver.findElement(By.id("show-textbox"));
            WebElement textbox = driver.findElement(By.name("show-hide"));
            
            show.click();
            if(textbox.isDisplayed()) {
            	System.out.println("thank you textbox is displyed");
            }
            else {
            	System.out.println("can not find text box");
            }
            
            
             
            hide.click();
            if(textbox.isDisplayed()) {
           	
           	System.out.println("thank you text box is displyed");
                                                                        }
            else {
            	System.out.println("can not find text box");
                                                                   }

	}

}
