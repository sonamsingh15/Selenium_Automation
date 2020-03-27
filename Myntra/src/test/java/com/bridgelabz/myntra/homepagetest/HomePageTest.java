package com.bridgelabz.myntra.homepagetest;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.myntra.base.Base;
import com.bridgelabz.myntra.page.HomePage;

public class HomePageTest extends Base {
	WebDriver driver;
	HomePage hp;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialize();
		hp = new HomePage();
	}
	
	@Test()
	public void homePage_test() throws InterruptedException, AWTException {
		hp.home_page();
		Thread.sleep(2000);
		hp.searchT("casual t shirt");
		Thread.sleep(1000);
		hp.filterT();
		Thread.sleep(1000);
		hp.selectT();
		Thread.sleep(2000);
		hp.switchTab();
		Thread.sleep(2000);
		hp.gotoBag();
		Thread.sleep(1000);
		hp.changeQty();
		Thread.sleep(1000);
		hp.removeItem();
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}