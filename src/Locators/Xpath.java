package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//1-X path by attribute
		//Syntax-//tagname[@attribute name='attribute value']
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Prashant");
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		//2-X path by text
		//syntax-//tagname[text()='text value']
        
		
		
		
		
		
		
	}

}
