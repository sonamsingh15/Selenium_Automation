package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.GoogleSearch;
import page.GooglePageObject;

public class GoogleSearchTest {
	private static WebDriver driver=null;

	
	public static void main(String[] args) {
		googleSearch();
	}

public static void googleSearch() {
	WebDriverManager.chromedriver().version("2.36").setup();
     driver=new ChromeDriver();
     
     GooglePageObject searchPage=new GooglePageObject(driver);
     driver.get("https://google.com");
	

	//GoogleSearch.button_search(driver).sendKeys("automation");
	//GoogleSearch.textBox_search(driver).sendKeys();
	
     searchPage.setTextInSearchbox("hello google");
     searchPage.clickSearchButton();
    driver.quit();
}


}
