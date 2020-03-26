package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import page.FbHomePage;
import page.FbLoginPage;
 
public class FbloginTest extends TestBase{
 
	
@BeforeMethod	
public void setup() {
	initialize();
}
	
 @Test(priority = 1)
 public void init() throws Exception{
 

 FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
 loginpage.setEmail("8329325892");
 loginpage.setPassword("7755909935");
 loginpage.clickOnLoginButton();
 
 FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
 homepage.clickOnProfileDropdown();
 homepage.verifyLoggedInUserNameText();
 homepage.clickOnLogoutLink(); 
 }
 
 @AfterMethod
	public void TeardownTest() {
		TestBase.driver.quit();
	}
 
}

