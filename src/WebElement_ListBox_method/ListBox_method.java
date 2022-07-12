package WebElement_ListBox_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_method {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		
			Thread.sleep(3000);
		    WebElement listbox = driver.findElement(By.name("dropdown-class-example"));
		    
		    Select s=new Select(listbox);
		    
		    s.selectByVisibleText("Option1");
		    
		    Thread.sleep(3000);
			s.selectByValue("option2");
			
			Thread.sleep(3000);
            s.selectByIndex(3); 
			
			System.out.println(s.isMultiple());			
			//is not multiselected
			
			
			
			
			
	}

}
