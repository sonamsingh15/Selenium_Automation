package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Keyboard_Mouse_Operations {
public static void main(String[] args) throws InterruptedException, AWTException {
//System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
//WebDriverManager.firefoxdriver().setup();
WebDriverManager.chromedriver().version("2.36").setup();


//1. Launch the browser
WebDriver driver = new ChromeDriver();//2. enter the url -
driver.navigate().to("http://google.com");
//Thread.sleep();


//Creating an object of Robot Class
Robot r = new Robot();

//move the mouse by x and y coordinate
r.mouseMove(400, 500);

//press ALT key from keyboard
r.keyPress(KeyEvent.VK_ALT);

//press F key from keyboard
r.keyPress(KeyEvent.VK_F);

//Release F key from keyboard
r.keyRelease(KeyEvent.VK_F);

//Release Alt key from keyboard
r.keyRelease(KeyEvent.VK_ALT);
Thread.sleep(3000);

//Press W key from keyboard to open a new private window
r.keyPress(KeyEvent.VK_W);

//Release W key from keyboard
r.keyRelease(KeyEvent.VK_W);
Thread.sleep(3000);

// It will close only the current browser window
//driver.close();
// It will close all the browser windows opened by Selenium
driver.quit();
}}