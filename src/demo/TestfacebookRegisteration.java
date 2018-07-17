package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class TestfacebookRegisteration {

	public static void main(String[] args) throws InterruptedException {
		
		
	// Google Chrome Browser	
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

   // Microsoft Edge Browser
		
	//	System.setProperty("webdriver.edge.driver","C:\\Selenuim\\EdgeDriver\\MicrosoftWebDriver.exe");
	//	WebDriver driver = new EdgeDriver();

 // FireFox Browser		
	
	//	System.setProperty("webdriver.gecko.driver","C:\\Selenuim\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
			 
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Learn");
		
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Automation");
		
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("email");
		
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("password");
		
		Select sel_day = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		
		sel_day.selectByIndex(17);
		
		Select sel_mon = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		
		sel_mon.selectByValue("8");
		
		Select sel_year = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		sel_year.selectByVisibleText("1990");
						
		driver.findElement(By.xpath(".//*[@id='u_0_z']/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
				
	}

}
