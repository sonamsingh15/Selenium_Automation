package com.bridgelabz.ebook.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		

		// create
		driver.findElement(By.id("u_0_m")).sendKeys("Sonam");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("juhisingh1494@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_u")).sendKeys("juhisingh1494@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_w")).sendKeys("sonamsingh1528");
		Thread.sleep(3000);
		driver.findElement(By.id("day")).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("April");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_13")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("code_in_cliff")).sendKeys("50048");
		driver.findElement(By.id("u_9_j")).click();

	}
}
