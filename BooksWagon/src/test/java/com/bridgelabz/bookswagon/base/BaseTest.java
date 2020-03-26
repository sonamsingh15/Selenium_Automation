package com.bridgelabz.bookswagon.base;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	 public static WebDriver driver=null;
	
	public static void initialize() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.bookswagon.com");

		Set<String> allWindowHandles = driver.getWindowHandles();
		
		int count = allWindowHandles.size();
		System.out.println("Number windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		System.out.println("Window handle id of page -->"+ title +" --> is : "+windowHandle);
		}
		}}


		