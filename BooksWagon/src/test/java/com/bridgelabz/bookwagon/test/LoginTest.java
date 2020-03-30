package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.Base;
import com.bridgelabz.bookswagon.page.LoginPage;

public class LoginTest extends Base{

	
	@BeforeMethod
	public void SetUp() {
		Initialize();
	}
	@Test
	public static void givenLoginPage_WhenEnterTheLoginDetail_ShouldLoginSuccessful() throws AWTException, InterruptedException {
		LoginPage customer=new LoginPage(driver);
		customer.existingCustomers();
		customer.mail("sonamsingh1528@gmail.com");
		Thread.sleep(1000);
		customer.password("9431603863");
		customer.login();
			
	}
	
	}
	

