package com.bridgelabz.selenium.screeshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bridgelabz.selenium.base.Base;

public class ScreenShot extends Base{
		public static void takeScreenshot() throws InterruptedException, IOException {
			driver.get("https://facebook.com");
			Thread.sleep(500);
			System.out.println(driver.getTitle());
			driver.findElement(By.id("email")).sendKeys("8329325892");
			driver.findElement(By.id("pass")).sendKeys("7755909935");
			Thread.sleep(2000);
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("/home/admin1/FbloginPage/SeleniumBasic/screenShot/ScreenShot.png");
			FileUtils.copyFile(srcFile, destFile);
			driver.findElement(By.id("loginbutton")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("userNavigationLabel")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[contains(@text()='Log Out')]")).click();
		}

		public static void main(String[] args) throws InterruptedException, IOException {
			@SuppressWarnings("unused")
			Base base = new Base();
			takeScreenshot();
		}
	
}