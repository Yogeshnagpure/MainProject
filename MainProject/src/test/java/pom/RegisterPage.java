package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
	 WebDriver driver;
	 
	 public RegisterPage(WebDriver driver)
	 {
		 this.driver= driver;
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath ="//input[@id='input-firstname']")
	 private WebElement firstnameField1;
	 
	 @FindBy(xpath = "//input[@id='input-lastname']")
	 private WebElement lastnameField1;
	 
	 @FindBy(xpath = "//input[@id='input-email']")
	 private WebElement emailField1;
	 
	 @FindBy(xpath = "//input[@id='input-telephone']")
	 private WebElement telephoneField1;
	 
	 @FindBy(xpath = "//input[@id='input-password']")
	 private WebElement passwordField1;
	 
	 @FindBy(xpath = "//input[@id='input-confirm']")
	 private WebElement confirmPasswordField1;
	 
	 @FindBy(xpath = "//input[@name='agree']")
	 private WebElement agreebtn1;
	 
	 @FindBy(xpath = "//input[@value='Continue']")
	 private WebElement continueBtn1;
	 
	 
	 public void firstnamefield(String firstname)
	 {
		 firstnameField1.sendKeys(firstname);
	 }
	 
	 public void lastnameField(String lastname)
	 {
		 lastnameField1.sendKeys(lastname);
	 }
	 
	 public void emailField(String email)
	 {
		 emailField1.sendKeys(email);
	 }
	 
	 public void telephoneField(String telephone)
	 {
		 telephoneField1.sendKeys(telephone);
	 }
	 
	 public void passwordField(String password)
	 {
		 passwordField1.sendKeys(password);
	 }
	 
	 public void confirmPasswordField(String confirmPassword)
	 {
		 confirmPasswordField1.sendKeys(confirmPassword);
	 }
	 
	 public void agreebtn()
	 {
		 agreebtn1.click();
	 }
	 
	 public void continueBtn()
	 {
		 continueBtn1.click();
	 }
	 
	 
	

}
