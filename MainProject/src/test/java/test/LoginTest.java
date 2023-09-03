package test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import pom.HomePage;
import pom.RegisterPage;
import utilities.Base;
import utilities.Util;

public class LoginTest extends Util

{
	WebDriver driver;
	Base base= new Base();

	@BeforeMethod
	public void Setup() throws IOException
	{
		driver = base.webdriverInitializer();

	}

	@AfterMethod
	public void TearDown() throws InterruptedException
	{
		base.tearDown();
	}


	@Test
	public void registerwithmanadatoryfield() throws IOException
	{
		HomePage home = new HomePage(driver);
		home.myAccountLogo();
		home.registerBtn();
	
		RegisterPage register = new RegisterPage(driver);
		register.firstnamefield("Yogesh");
		register.lastnameField("Nagpure");
		register.emailField("earnlikeproq"+RandomString.make()+"@gmail.com");
		register.telephoneField("1234567890");
		register.passwordField("7768842038");
		register.confirmPasswordField("7768842038");
		register.agreebtn();
		Util.getScreenshot(driver, "register");
		register.continueBtn();
		
	}

}
