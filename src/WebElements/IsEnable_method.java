package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_method {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.discoveryplus.in/");
			
			Thread.sleep(15000);
			driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
			
			Thread.sleep(10000);
			WebElement getOTPbutton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
			
			System.out.println(getOTPbutton.isEnabled());
			
			driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
			getOTPbutton.click();
	}
}
