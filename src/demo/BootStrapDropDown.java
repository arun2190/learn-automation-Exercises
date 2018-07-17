package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class BootStrapDropDown {

	
		
		public static void main(String[] args) throws InterruptedException {
			
				System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
			//	System.setProperty("webdriver.edge.driver","C:\\Selenuim\\EdgeDriver\\MicrosoftWebDriver.exe");
				
				
			//	WebDriver driver = new EdgeDriver();
		     	WebDriver driver = new ChromeDriver();
		     	
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
				
				driver.findElement(By.xpath(".//*[@id='menu1']")).click();
				
			List<WebElement> dd_menu = driver.findElements(By.xpath(".//ul[@class='dropdown-menu']//li/a"));
			
			// Using Enhanced Loop
			
			for(WebElement element:dd_menu){
				
				String innerhtml = element.getAttribute("innerHTML");
				if(innerhtml.contentEquals("JavaScript")){
					
					element.click();
					break;
				}
						
				
				System.out.println("Values from InnerHTML "+innerhtml);
				
			}
			  driver.quit();
			
				
	  	}		

	}


