package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_method {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
		     /*.GetText method
		      * use- text present in web page
		      */
			
			Thread.sleep(1000);
			//1 
			System.out.println(driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText());
			
			//2
			String gettext = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
			System.out.println(gettext);
			
			//3
			WebElement element = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
			System.out.println(element.getText());
			
			
	}

}
