package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.Base;
import com.bridgelabz.bookswagon.page.BuyBook;
import com.bridgelabz.bookswagon.page.SearchBar;

public class BuyBookTest extends Base {
	@BeforeClass
	public void Setup() {
	Initialize();
	}

 
@Test
public static void buyNow() throws AWTException, InterruptedException{
	 SearchBarTest search= new SearchBarTest();
	 search.givenAuthorName_whenSearchBook_ShouldReturnThisBook();
	 
	 BuyBook buyBook=new BuyBook(driver);
	 buyBook.bookName();
	 buyBook.onClick();
	 buyBook.buyNow();
	 buyBook.onClick();

	 
	 
} 

}
