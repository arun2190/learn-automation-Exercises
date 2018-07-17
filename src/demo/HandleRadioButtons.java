package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	    
	    List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    for(WebElement element:chkbox){
	    	
	    	String value = element.getAttribute("id");
	    	
	    	if(value.equalsIgnoreCase("code")) {
	    		
	    		element.click();
	    		break;
	    	}
	    	
	    	System.out.println("Values from Checkbox are "+value);
	    	
	    }
	    
	    System.out.println("Radio buttons below ");
	    List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	    for(WebElement element:radio){
	    	
	    	String value = element.getAttribute("value");
	    	
	    	if(value.equalsIgnoreCase("python")) {
	    		
	    		element.click();
	    		break;
	    	}
	    	
	    	System.out.println("Values from Radio Buttons are "+value);
	    	
	    		    		    	
	    }
	    
	    driver.quit();

	}

}
