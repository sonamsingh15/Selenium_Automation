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

import com.bridgelabz.bookswagon.base.BaseTest;
import com.bridgelabz.bookswagon.page.Homepage;

public class BooksWagonTest extends BaseTest {

@BeforeClass
	public void setup() {
	initialize();
	}

 
@Test(priority=1)
public static void WhenTypeAuthorAndBookName_ShouldReturnBooklist() {
 Homepage searchBook= new Homepage(driver);
 searchBook.searchBar("Ravinder Singh");
 searchBook.buttonClick();
 }

@Test(priority=2)
public static void addedBook() throws AWTException {
	Homepage addBook=new Homepage(driver);
	addBook.findBook();
	addBook.buttonClick();
	addBook.buyNow();
	addBook.buttonClick();
	addBook.quantity();
//driver.findElement(By.xpath("//input[@name=\"BookCart$lvCart$imgPayment\"]")).click();


	
}

@AfterClass
public void close() {
	driver.close();
}


	
}



