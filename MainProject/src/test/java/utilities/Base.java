package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base 
{
	Properties prop;
	
	WebDriver driver;
	
	
	public WebDriver webdriverInitializer() throws IOException
	{
		prop = new Properties();
		
		File file= new File("/Users/apple/eclipse-workspace/MainProject/src/test/java/resources/data.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}else 
		{
			driver= new SafariDriver();
		}
		return driver;
				
	}
	
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
