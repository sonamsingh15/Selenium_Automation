package com.bridgelabz.selenium.locaters;

import org.openqa.selenium.By;

import com.bridgelabz.selenium.base.Base;

public class Locators extends Base {
	static Base base;

	public static void main(String[] args) throws InterruptedException {
		base = new Base();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("8329325892");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("7755909935");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#userNavigationLabel")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

}