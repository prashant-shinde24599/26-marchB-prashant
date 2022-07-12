package Logical_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_ex2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    Thread.sleep(2000);
		 
		    List<WebElement> totalrow = driver.findElements(By.xpath("//table//tr"));
		    int row = totalrow.size();
		    System.out.println(row);
		    
		    List<WebElement> totalcell = driver.findElements(By.xpath("//table//tr[1]//th"));
		    int cell = totalcell.size();
		    System.out.println(cell);
		    
		    List<WebElement> read = driver.findElements(By.xpath("//table//tr"));
		    
		    Iterator<WebElement> it = read.iterator();
		    
		    while(it.hasNext())
		    {
		    	System.out.print(it.next().getText()+" ");
		    	System.out.println();
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
