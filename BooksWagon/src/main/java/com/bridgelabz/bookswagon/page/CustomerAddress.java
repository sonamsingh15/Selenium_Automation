package com.bridgelabz.bookswagon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerAddress {

public static WebDriver driver;
	
	public CustomerAddress() {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath ="//input[@id='ctl00_cpBody_txtNewRecipientName']")
WebElement recpName;

@FindBy(id="ctl00_cpBody_txtNewCompanyName")
WebElement comapanyName;

@FindBy(name="ctl00$cpBody$txtNewAddress")
WebElement streetAddress;
//----------------

//droupdown country-------------------


@FindBy(xpath="//div[@class='sortddl4']")
WebElement dropdownCountrylist;

@FindBy(xpath="//option[@value='113']")
WebElement country;

//------------droupbownstate
@FindBy(xpath="//select[@id='ctl00_cpBody_ddlNewState']")
WebElement dropdownStateList;

@FindBy(xpath="//option value='BR']")
WebElement state;
//<option value="BR">Bihar</option>

@FindBy(id="ctl00_cpBody_txtNewCity")
WebElement cityName;

@FindBy(id="ctl00_cpBody_txtNewPincode")
WebElement pinNumber;

@FindBy(id="ctl00_cpBody_txtNewPhone")
WebElement phoneNumber;



public void recipitienName(String name) {
	recpName.sendKeys(name);
	
}
public void nameOfComapany(String name) {
	comapanyName.sendKeys(name);
	
}
public void streetAddress(String address) {
	streetAddress.sendKeys(address);
	
	
}
public void selectCountry() throws InterruptedException{
	dropdownCountrylist.click();
	 Select select=new Select(country);
     select.selectByVisibleText("India");
     Thread.sleep(2000);
}
public void selectState() throws InterruptedException{
	dropdownStateList.click();
	 Select dropdownStateList=new Select(state);
	 dropdownStateList.selectByVisibleText("Bihar");
    // select.selectByIndex();
     Thread.sleep(2000);
}
public void enterCityName(String city) {
	cityName.sendKeys(city);
	
}
public void enterPinCode(String pin) {
	pinNumber.sendKeys(pin);
}
public void enterphoneNumber(String number) {
	phoneNumber.sendKeys(number);
	
}
}