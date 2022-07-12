package Set_Size_and_Position;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
	    Thread.sleep(2000);
        
	    System.out.println(driver.manage().window().getSize());
	    
	    //create object of dimension class passing width &hight
	    
	    Dimension d= new Dimension(1500, 2000);
	    
	    driver.manage().window().setSize(d);
	}

}
