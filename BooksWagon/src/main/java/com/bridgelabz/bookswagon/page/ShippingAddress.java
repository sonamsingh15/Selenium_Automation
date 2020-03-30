package com.bridgelabz.bookswagon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddress {

public static WebDriver driver;
	
	public ShippingAddress() {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
        @FindBy(xpath ="//input[@id='ctl00_cpBody_txtNewRecipientName']")
        WebElement recpName;
	//input[@id="ctl00_cpBody_txtNewRecipientName"]
        
        public void recipitienName(String name) {
        	recpName.sendKeys("name");
			
		}
}
