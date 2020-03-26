package com.bridgelabz.bookswagon.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
 @FindBy(id="ctl00_TopSearch1_txtSearch") 
  WebElement profileSearch;
 
 @FindBy(id="ctl00_TopSearch1_Button1")
 WebElement clicked;
 
 @FindBy(xpath ="//a[contains(text(),'Will You Still Love Me?')]")
 WebElement findBook;
 
 @FindBy(xpath ="//input[@value='Buy Now']")
 WebElement buyNow;

@FindBy(id="BookCart_lvCart_imgPayment") 
//@FindBy(xpath ="//input[@name=\\\"BookCart$lvCart$imgPayment\\\"]")
WebElement quantity;


public void searchBar(String element) {
 profileSearch.sendKeys(element);	
}

public void buttonClick() {
clicked.click();
}

public void findBook() {
findBook.click();
	
}
public void buyNow(){
buyNow.click();
}
//Handle popup
//click on QTY and use backspace and then enter value
public void quantity() throws AWTException {
   //driver.switchTo().alert();	
    //Set<String> winHandleAfter = driver.getWindowHandles();
	//	JavascriptExecutor js= (JavascriptExecutor) driver;
	//jst.executeScript("document.getElementById.value =quantity; ", 55, driver.findElement(By.id("id")));
   //  js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");
    // js.executeScript("document[0].click();",element);
  //   js.executeScript("document.getElementById('BookCart_lvCart_ctrl0_txtQty').value='2';");
    //jst.executeScript("document.getElementById('BookCart_lvCart_ctrl0_txtQty').checked=false;");
	  //	driver.switchTo().window(winHandleAfter);
     //	quantity.clear();
    //System.out.println(winHandleAfter.size());
	
Robot robot = new Robot();
robot.mouseMove(787, 404);
robot.keyPress(KeyEvent.VK_ENTER);
}
}
