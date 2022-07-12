package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_method {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		
			Thread.sleep(3000);
			WebElement checkboxoption2 = driver.findElement(By.name("checkBoxOption2"));
		    
			//checkboxoption2.click();
			if(checkboxoption2.isSelected()) 
			{
				System.out.println("checkbox2 is already selected");
			}
			else {
				checkboxoption2.click();
				System.out.println("checkbox is now selected");
			}
			
			
			
	}

}
