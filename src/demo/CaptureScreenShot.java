package demo;

import java.io.File;
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenShot {
	
	@Test
	public static void captureScreenMethod() throws Exception{
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenuim\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
		
		// take Screen Shot
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Copy file to new png file at specified location  
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\arukumar\\Desktop\\ScreenShots\\screenshot1.png"));
		driver.close();
		
	}
}