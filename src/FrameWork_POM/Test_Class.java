package FrameWork_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation\\Selenium deivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
		
		    KiteLoginPage login=new  KiteLoginPage(driver);
		    login.sendUsername();
		    login.sendPassward();
            login.clickonLoginbutton();
            Thread.sleep(1000);
            
            KitePinPage Pinlogin=new  KitePinPage(driver);
            Pinlogin.sendPin();
            Pinlogin.clickOnContinueButton();
            Thread.sleep(1000);
            
            KiteHomePage home=new KiteHomePage(driver);
            home.validateUsername();
            home.logout();
            
            
	}

}
