package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.base.Function;

@SuppressWarnings("unused")

public class FluentWaitClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Setup(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Selenuim\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
	}
	
	
	@Test
	public void fluentWaitMethod(){
		
				
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();
		// Fluent Wait with Duration 
						
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				
				WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
				
				String getTextOnPage = element.getText();
				
				if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
				
					System.out.println(getTextOnPage);
					
					return element;
					
				} else {
					
					System.out.println("FluentWait Failed");
					
					return null;
				} 
			}
		});
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
}