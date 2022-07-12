package Kite_TestNG_Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage_E {

	// 1 data members
	@FindBy(id = "userid") private WebElement Username;
	@FindBy(id = "password")private WebElement Passward;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	// 2 constructor
	public KiteLoginPage_E (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// 3 method
	public void sendUsername(String UserName)
	{
		Username.sendKeys(UserName);
	}
	
	public void sendPassward(String PassWard)
	{
		Passward.sendKeys(PassWard);
	}
	
	public void clickonLoginbutton()
	{
		loginButton.click();
	}
	
	
}
