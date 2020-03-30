package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;
import java.sql.DriverAction;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.Base;
import com.bridgelabz.bookswagon.page.Homepage;
import com.bridgelabz.bookswagon.page.LoginPage;

public class BooksWagonTest extends Base {

@BeforeClass
	public void Setup() {
	Initialize();
	}

 
@Test
public static void WhenUserTypeAuthorAndBookName_ShouldAbleToPlaceOrder()throws AWTException, InterruptedException {

LoginTest login=new LoginTest();
login.givenLoginPage_WhenEnterTheLoginDetail_ShouldLoginSuccessful();


Homepage addBook= new Homepage(driver);
addBook.searchBar("Ravinder Singh");
 addBook.onClick();

//user search by author name 
	addBook.searchBookByName();
	Thread.sleep(100);
	addBook.onClick();

//click to buy 
	addBook.buyNow();
	Thread.sleep(5000);
	addBook.onClick();
	
//order place	
	addBook.PlaceOrder();
	addBook.onClick();
	
	addBook.ContinueShopping();
	Thread.sleep(5000);
 
	addBook.recipitienName("sonamsingh");
	addBook.nameOfComapany("Bridgelabz");
	addBook.streetAddress("vashi sector 3, navi mumbai ");
	addBook.enterCityName("Mumbai");
	addBook.enterPinCode("400706");
	addBook.enterphoneNumber("8084845315");
	
	addBook.sameAddress();
	addBook.saveAndContinue();
	Thread.sleep(100);
	addBook.payment();
    Thread.sleep(1000);
	
}

@AfterClass
public void close()  {
	driver.close();
}


	
}



