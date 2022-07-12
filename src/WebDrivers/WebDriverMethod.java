package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");

		
		//1.get method         use URL open the bowser
		//Syntax-driver.get()
		
				
		//2.close method       close the current tab by open the browser
		//syntax-driver.close()
		
		//driver.close();
		
		//3.quit method        close to all the tab present in browser
		//syntax-driver.quit
		
		//driver.quit();
		
		//4.minimize maximize     to current tab
		
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.manage().window().minimize();
//
//        driver.navigate().to("https://www.facebook.com/");
//        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        driver.navigate().refresh();
		String title= driver.getTitle();
		System.out.println(title);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		
		
	
		
	}

}
