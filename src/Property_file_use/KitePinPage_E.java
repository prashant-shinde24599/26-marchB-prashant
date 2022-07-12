package Property_file_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage_E {
	
	// 1 data member
		@FindBy(id = "pin")private WebElement Pin;
		@FindBy(xpath = "//button[@type='submit']") private WebElement continueBotton;

		
		// 2 constructor
		public KitePinPage_E ( WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		// 3 method
		
		public void sendPin(String PIN2) 
		{
			Pin.sendKeys(PIN2);
		}
		
		public void clickOnContinueButton()
		{
			continueBotton.click();
		}

}
