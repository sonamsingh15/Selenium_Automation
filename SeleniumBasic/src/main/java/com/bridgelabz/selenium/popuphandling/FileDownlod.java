package com.bridgelabz.selenium.popuphandling;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.bridgelabz.selenium.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownlod extends Base {

	public static void fileDownload() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		chromePref.put("profile.default_content_setting.popups", 0);
		chromePref.put("download.default_directory", "/home/user/eclipse-workspace/apptest");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("64 bit Windows IE")).click();
		System.out.println("Downloaded");

	}

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("unused")
		Base base = new Base();
		fileDownload();

	}

}