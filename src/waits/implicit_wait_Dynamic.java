package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/");
			
			//Thread.sleep(2000);    //100-->load the page
		                             //1900-->wait the page or loss the time
			
			//*implicit wait       ==>all page loading
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); //100-->load the page
	         driver.close();                                                                   //direct program excecuting

	}

}
