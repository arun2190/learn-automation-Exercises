package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

@SuppressWarnings("unused")
public class VerfiyErrorMessages {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.gmail.com");
	    driver.findElement((By.xpath(".//*[@id='identifierNext']/content"))).click();
	    
	    Thread.sleep(2000);
	    
	    String actual_error = driver.findElement(By.xpath("//div[contains(@class,'dEOOab RxsGPe')]")).getText();
	    
	    String expected_error = "Enter an email or phone number";
	    
	    //Type1
	    Assert.assertEquals(actual_error,expected_error);
	    //Type2
	    Assert.assertTrue(actual_error.contains("Enter an email or phone"));
	    
	    System.out.println("Test Completed");
	    		
	    driver.quit();

	}

}
