package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class LocatorsExample{
public class LocaterTest {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().version("2.36").setup();


//1. Launch the browser
WebDriver driver = new ChromeDriver();//2. enter the url -
// Enter the URL of your own created sample web page
driver.get("file:///home/admin1/FbloginPage/FbloginPage/id.html");

// Used “id” locator to find USERNAME text box
WebElement ubTB= driver.findElement(By.id("username"));
//Clear the existing value present in the text box
ubTB.clear();

// Enter value into the USERNAME text box
ubTB.sendKeys("ajit.biswas@gmail.com");

// Used “name” locator to find Password text box
WebElement passTB = driver.findElement(By.id("pass"));
//Clear the existing value present in the text box
passTB.clear();

//Enter value into the PASSWORD text box
passTB.sendKeys("9431603865");
//Halt the program execution for 2 seconds

// Enter value into the Password text boxpassTB.sendKeys("Qspiders123");
// Find the address of ActiTIME Link and click
driver.findElement(By.linkText("Click ActiTIME link")).click();
Thread.sleep(2000);
}}
