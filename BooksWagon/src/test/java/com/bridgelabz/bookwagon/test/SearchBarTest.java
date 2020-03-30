package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.Base;
import com.bridgelabz.bookswagon.page.SearchBar;

public class SearchBarTest extends Base {
	
	@BeforeClass
	public void setup() {
	Initialize();
	}

 
@Test
public static void givenAuthorName_whenSearchBook_ShouldReturnThisBook() throws AWTException, InterruptedException{
	
LoginTest loginCustomer=new LoginTest();
loginCustomer.givenLoginPage_WhenEnterTheLoginDetail_ShouldLoginSuccessful();	

SearchBar search= new SearchBar(driver);
search.SearchBar("Ravinder Singh");
search.onClick();
}
}
