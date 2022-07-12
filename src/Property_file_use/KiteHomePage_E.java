package Property_file_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage_E {
	
	//1 data member
	
		@FindBy(xpath = "//span[@class='user-id']")private WebElement username;
		@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
		
		
		
		//2 constructor
		
		public KiteHomePage_E(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
			
		public String getactualusername()
		{
			String actualusername = username.getText();
			return actualusername;
		}
		
		public void logout() throws InterruptedException
		{
			username.click();
			Thread.sleep(200);
			logoutButton.click();
		}
		

}
