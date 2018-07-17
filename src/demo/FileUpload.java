package demo;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 
public class FileUpload {
 
@Test
public void Fileupload() throws AWTException, InterruptedException{
 
 
// Start browser
	System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
 
// maximize browser
 driver.manage().window().maximize();
        
  // Specify the file location with extension
 StringSelection sel = new StringSelection("C:\\Users\\arukumar\\Desktop\\1.txt");
 
   // Copy to clipboard
 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
 System.out.println("selection" +sel);
 
 
// Open Monster.com
 driver.get("http://my.monsterindia.com/create_account.html");
 Thread.sleep(2000);
 
 // This will scroll down the page 
 JavascriptExecutor js = (JavascriptExecutor)driver;
 js.executeScript("scroll(0,350)");
 
// Wait for 5 seconds
 Thread.sleep(5000);
 
// This will click on Browse button
 driver.findElement(By.id("wordresume")).click();
 
 
 
 System.out.println("Browse button clicked");
 
 // Create object of Robot class
 Robot robot = new Robot();
 Thread.sleep(1000);
      
  // Press Enter
 robot.keyPress(KeyEvent.VK_ENTER);
 
// Release Enter
 robot.keyRelease(KeyEvent.VK_ENTER);
 
  // Press CTRL+V
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 
// Release CTRL+V
 robot.keyRelease(KeyEvent.VK_CONTROL);
 robot.keyRelease(KeyEvent.VK_V);
 Thread.sleep(1000);
        
 // Press Enter 
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 
 driver.get("http://www.naukri.com");
//Type something on Skill textbox
driver.findElement(By.xpath("//span[@class='searchJob']")).click();
driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']")).sendKeys("QA Engineer");

//Create object on Actions class
Actions builder=new Actions(driver);

//find the element which we want to Select from auto suggestion
WebElement ele=driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));

//use Mouse hover action for that element
builder.moveToElement(ele).build().perform();

//Give wait for 2 seconds 
Thread.sleep(2000);

//finally click on that element
builder.click(ele).build().perform();
}
 
}
 
