package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {

	WebDriver driver;
	
	@BeforeMethod
	public void setupApplication(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
		Reporter.log("========Application Started=====",true);	
	}
	
	@Test
	public void loginToApplication(){
				
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("========Click on Login Button=====",true);	
		
		
	}
	
	@AfterMethod
	public void closeApplication(){
		
		driver.quit();
		Reporter.log("========Browser Session End=====",true);		
	}
	

}