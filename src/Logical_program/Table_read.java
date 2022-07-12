package Logical_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table_read {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
		    Thread.sleep(2000);
             
		    //how to find no of row in table
		     List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		    int total = row.size();
		    System.out.println(total);
		   System.out.println("=========================");
		   
		   //how to find no of column in table
		   
		   List<WebElement> totalcol = driver.findElements(By.xpath("//table//tr[1]//th"));
		   int col = totalcol.size();
		   System.out.println(col);
		   System.out.println("========================");
		   
		   //read all table
		   List<WebElement> read = driver.findElements(By.xpath("//table//tr"));
		   
		   Iterator<WebElement> it = read.iterator();          //travel the table by using iterator
		   Thread.sleep(2000);
		   while(it.hasNext())
		   {
			   System.out.print(it.next().getText()+" ");
			   System.out.println();
			   
		   }
	}
	

}
