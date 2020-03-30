package com.bridgelabz.bookswagon.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Key;
import com.mongodb.client.model.geojson.Point;


public class Homepage {
	public static WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);
}
	
//search book---	
 @FindBy(id="ctl00_TopSearch1_txtSearch") 
 WebElement searchBar;
 
 @FindBy(id="ctl00_TopSearch1_Button1")
 WebElement clicked;
 
 @FindBy(xpath ="//a[contains(text(),'Will You Still Love Me?')]")
 WebElement searchBook;
 
 @FindBy(xpath ="//input[@value='Buy Now']")
 WebElement buyNow;
 
 
 @FindBy(xpath ="//input[@value='Add to Wishlist']")
 WebElement addToWishlist;
 
 
 //logindetail---------------------------------
 @FindBy(xpath = "//[@id\"ctl00_cpBody_plnNewLogin\"]")
 WebElement logindetail;

@FindBy(xpath ="//input[@id='ctl00_phBody_SignIn_txtEmail']")
WebElement email;

@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
WebElement pwsd;

@FindBy(xpath = "//input[@value='Login']")
WebElement login;

//placeOrder----------
@FindBy(xpath ="//input[@name='BookCart$lvCart$imgPayment']")
WebElement PlaceOrder;

@FindBy(xpath ="//a[@class='my-cart active']")
WebElement addbag;

@FindBy(xpath ="//a[@class='btn-red']")
WebElement shoppingContinue;

//-----------------------------------------------method--------------------------------------------------

public void searchBar(String element) {
	 searchBar.sendKeys(element);	
}

public void onClick() throws AWTException {
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}

public void searchBookByName() {
searchBook.click();
}

public void buyNow(){
buyNow.click();
}

//---------------email-----------
public void loginDetail() {
	logindetail.click();
}

public void email(String element) {
email.sendKeys(element);
}

public void password(String element) {
pwsd.sendKeys(element);
}

//----------------------------
public void addbag() {
addbag.click();
}

public void addToWishList() {
addToWishlist.click();
}

public void removeItem() {
driver.findElement(By.xpath("//a[@id='BookCart_lvCart_ctrl0_imgDelete']")).click();

//------------------------------------	
}
public void PlaceOrder() throws AWTException{
driver.get("https://www.bookswagon.com/shoppingcart.aspx?&pid=23160394&vid=26&ptype=1");
driver.findElement(By.xpath("//input[@value=\"Place Order\"]")).click();
}

public void ContinueShopping() {
	shoppingContinue.click();
	
}

public void quantity() throws AWTException {
 
}
//------------------------
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

@FindBy(id="ctl00_cpBody_lvCustomerAdd_ctrl1_imgUseAddress")
WebElement checkbox;

@FindBy(id="ctl00_cpBody_ShoppingCart_lvCart_savecontinue")
WebElement saveContinue;

@FindBy(id="ctl00_cpBody_btnCCAvenue")
WebElement payNow;

public void sameAddress() {
	checkbox.click();
}
public void saveAndContinue() {
	saveContinue.click();
}
public void payment() {
	payNow.click();
	
}
	
}

