package com.bridgelabz.bookswagon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.bookswagon.base.Base;

public class BuyBook extends Base{
public static WebDriver driver;
	
	public BuyBook(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);
}

 @FindBy(xpath ="//a[contains(text(),'Will You Still Love Me?')]")
 WebElement bookName;
 
 @FindBy(xpath ="//input[@value='Buy Now']")
 WebElement buyNow;
 
 @FindBy(id="ctl00_TopSearch1_Button1")
 WebElement clicked;
 
  public void bookName() {
	bookName.click();
	 	
	 }
	 public void buyNow(){
	 buyNow.click();
	 }
	 
	 public void onClick() {
		 
		 
		 clicked.click();
	 }
}
