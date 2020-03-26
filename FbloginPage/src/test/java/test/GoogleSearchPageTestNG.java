package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import page.GooglePageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTestNG {
	WebDriver driver=null;
	
@BeforeClass
public void setUp() throws Exception {
	WebDriverManager.chromedriver().version("2.36").setup();
	driver= new ChromeDriver();
	
}
public void search() {  
     driver.get("https://google.com");
	
     driver.findElement(By.name("id")).sendKeys("Automation tseting");
     driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	} 
public void tearDownTest() {
	driver.close();
	driver.quit();
	System.out.println("Test completed Successfully");
}

}
