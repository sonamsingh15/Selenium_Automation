package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
	private static WebElement elements=null;
	
	public static WebElement textBox_search(WebDriver driver) {
	elements = driver.findElement(By.name("q"));
	return elements;
	}
	
	public static WebElement button_search(WebDriver driver) {
		elements=driver.findElement(By.name("btnK"));
		return elements;
		}
	}
