package Property_file_use;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
       protected WebDriver driver;
	public void Openbrowser() throws IOException {
		
		  System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Utility.GetdataFromPropertyfile("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
		
	}
	
}
