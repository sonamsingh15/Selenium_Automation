package com.bridgelabz.bookwagon.test;

import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.bridgelabz.bookswagon.base.Base;
import com.bridgelabz.bookswagon.page.PlacedOrder;

public class PlacedOrderTest extends Base {
	
	
	@BeforeClass
	public void SetUp() {
	Initialize();
	}

 
@Test
public static void givenAuthorName_whenSearchBook_ShouldReturnThisBook() throws AWTException,InterruptedException{
	BuyBookTest buynow=new BuyBookTest();
	BuyBookTest.buyNow();
	
	PlacedOrder orderplaced=new PlacedOrder();
	orderplaced.PlaceOrder();
	orderplaced.onClick();
	
	
	}
	 }
