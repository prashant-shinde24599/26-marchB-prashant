package FrameWork_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	// 1 data members
	@FindBy(id = "userid") private WebElement Username;
	@FindBy(id = "password")private WebElement Passward;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginButton;
	
	
	// 2 constructor
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// 3 method
	public void sendUsername()
	{
		Username.sendKeys("ELR321");
	}
	
	public void sendPassward()
	{
		Passward.sendKeys("Dhana1111");
	}
	
	public void clickonLoginbutton()
	{
		loginButton.click();
	}


	
	
	
	
	
	
	

}
