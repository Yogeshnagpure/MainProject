package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util
{
	WebDriver driver;
	
	public static WebElement waitforElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement newWebElement = wait.until(ExpectedConditions.visibilityOf(element));
		return newWebElement;
	}
	
	public static void getScreenshot(WebDriver driver, String methodname) throws IOException
	{
		TakesScreenshot shot = (TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/apple/Downloads/ScreenShot /"+methodname+".jpeg");
		FileHandler.copy(source, destination);
	}

}
