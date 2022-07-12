package FrameWork_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	// 1 data member
	@FindBy(id = "pin")private WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBotton;

	
	// 2 constructor
	public KitePinPage ( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 3 method
	
	public void sendPin() 
	{
		Pin.sendKeys("982278");
	}
	
	public void clickOnContinueButton()
	{
		continueBotton.click();
	}
}
