package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("file:///home/admin1/FbloginPage/FbloginPage/Web-Pages/Login.html");
		
		 //Locating the email field element via ID tag and storing it in the webelement
        WebElement USERNAME=driver.findElement(By.id("email"));
        
        //Entering text into the email field
        USERNAME.sendKeys("sadhvisinghXXXX@gmail.com");
        
        //Locating the password field element via ID tag and storing it in the webelement
        WebElement PASSWORD=driver.findElement(By.id("pass"));
                
        //Entering text into the password field
        PASSWORD.sendKeys("xxxxxxxxx");
        
        //Locating the login button to login to the application
        WebElement SIGIN=driver.findElement(By.id("u_0_2"));
        
        //Clicking on the 'login' button
        SIGIN.click();
        
 
		
		
		
		
	}
}