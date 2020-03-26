package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePageObject {
	
	WebDriver driver=null;

	By textbox_search=By.name("q");
	By button_search=By.xpath("//input[@value='Google Search']");
	
public GooglePageObject(WebDriver driver){
	this.driver=driver;	
	}
	
public void setTextInSearchbox(String text){
	driver.findElement(textbox_search).sendKeys(text);
	}

public void clickSearchButton(){
driver.findElement(textbox_search).submit();
}

}
