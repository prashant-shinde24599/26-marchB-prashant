package Set_Size_and_Position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
	
        System.out.println(driver.manage().window().getPosition());
        
        //set position to create oject of point class &pass X Y cordinate
        
        Point p=new Point(200, 100);
        
        driver.manage().window().setPosition(p);
	}

}
