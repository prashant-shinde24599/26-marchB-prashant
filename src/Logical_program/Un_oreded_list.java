package Logical_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Un_oreded_list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("q")).sendKeys("honda");
	    Thread.sleep(2000);
	    
	    List<WebElement> allresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    System.out.println(allresult.size());               //all size of search result
	  
        
	    for(WebElement r:allresult)
	    {                                                   //all search text
	    	System.out.println(r.getText());
	    }
	    
	    Thread.sleep(1000);
	    for(WebElement result:allresult)                    //compare actual to expected by using for each loop
	    {
	    	String actual = result.getText();
	    	String expected = "honda amaze";
	    	if(actual.equals(expected))
	    	{
	    		result.click();
	    		break;
	    	}
	    	
	    }
	    
	    driver.findElement(By.linkText("Images")).click();
	    
	    List<WebElement> allimg = driver.findElements(By.tagName("img"));           //count all images
	    System.out.println(allimg.size());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
