package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	public WebElement myAccountLogo1;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	public WebElement registerBtn1;
	
	
	
	
	public void myAccountLogo()
	{
		myAccountLogo1.click();
	}
	
	public void registerBtn()
	{
		
		registerBtn1.click();		
	}

}
