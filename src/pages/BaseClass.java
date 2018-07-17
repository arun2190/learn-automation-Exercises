package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

@SuppressWarnings("unused")
public class BaseClass {
	
public WebDriver driver;

@BeforeClass
public void setupApplication()
{
	
	Reporter.log("=====Browser Session Started=====", true);
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
    driver=new ChromeDriver();
    	
    driver.manage().window().maximize();
	
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
	
	Reporter.log("=====Application Started=====", true);
}


@AfterClass
public void closeApplication()
{
	driver.quit();
	Reporter.log("=====Browser Session End=====", true);
	
}
	
	

}
