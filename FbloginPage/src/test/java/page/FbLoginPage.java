package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class FbLoginPage {
 public static WebDriver driver;
 
        public FbLoginPage(WebDriver driver){ 
                 this.driver=driver; 
                 PageFactory.initElements(driver,this);
        }
 
 @FindBy(how=How.XPATH, using="//input[@type='email'][@name='email']") WebElement emailTextBox;
 @FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
 @FindBy(how=How.XPATH, using="//input[@value='Log In']") WebElement signinButton;
 
       
 public void setEmail(String strEmail){
 emailTextBox.sendKeys(strEmail);
 }

 public void setPassword(String strPassword){
 passwordTextBox.sendKeys(strPassword);
 }
 

 public void clickOnLoginButton(){
 signinButton.click();
 } 
 
}