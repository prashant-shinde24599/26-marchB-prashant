package WebElement_ListBox_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable_1 {   

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
			
			Thread.sleep(2000);
		     
			WebElement multiselected = driver.findElement(By.id("cars"));
			Select s=new Select(multiselected);
			System.out.println(s.isMultiple());
			
			s.selectByVisibleText("Volvo");
			Thread.sleep(200);
			s.selectByValue("saab");
			Thread.sleep(200);
			s.selectByIndex(2);
			Thread.sleep(200);
			s.selectByVisibleText("Audi");
			
//			Thread.sleep(300);
//			s.deselectAll();
			Thread.sleep(300);
			
			s.deselectByVisibleText("Audi");
			Thread.sleep(200);
			s.deselectByIndex(2);
			Thread.sleep(200);
			s.deselectByValue("saab");
			Thread.sleep(200);
			s.deselectByVisibleText("Volvo");
			
			Thread.sleep(200);
			System.out.println(s.getFirstSelectedOption().getText());
			s.getAllSelectedOptions();
			
	}

}
