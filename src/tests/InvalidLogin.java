package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.BaseClass;

public class InvalidLogin extends BaseClass {
	
	
	@Test(description="This TC will perform valid login")
	
	public void loginToApplication() throws Throwable 	{
		
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		
	}
	
	
	
	@Test(description="This TC will perform invalid login")
	public void loginToApplication1()
	{
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin1");
		
		driver.findElement(By.id("btnLogin")).click();
	}
	
	
}
