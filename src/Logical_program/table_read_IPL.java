package Logical_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_read_IPL {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.iplt20.com/points-table/men/2022");
		    Thread.sleep(2000);
            
		     List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
			    int total = row.size();
			    System.out.println(total);
			   System.out.println("=========================");
			
			   List<WebElement> totalcol = driver.findElements(By.xpath("(//table//tr[1])[1]//th"));
			   int col = totalcol.size();
			   System.out.println(col);
			   System.out.println("========================");
			   
			   List<WebElement> read = driver.findElements(By.xpath("//table//tr"));
			   
			   Iterator<WebElement> it = read.iterator();          //travel the table by using iterator
			   Thread.sleep(2000);
			   while(it.hasNext())
			   {
				   System.out.print(it.next().getText()+" ");
				   System.out.println();
				   
			   }
			 System.out.println();

	}

}
