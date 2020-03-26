package com.bridgelabz.enews.newsHeadline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java_cup.runtime.lr_parser;

public class NewsHeadline {
	private static WebDriver driver = null;
	
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		
	driver.get("https://news.ycombinator.com/");
		
	driver.findElement(By.xpath("//a[@class='morelink' and @rel='next']")).click();
	driver.findElement(By.xpath("//a[@class='morelink' and @rel='next']")).click();

	List<WebElement>newsElements=driver.findElements(By.cssSelector("a.storylink"));
	List<WebElement>scorePoints=driver.findElements(By.cssSelector("span.score"));
		
    List<String> newsHeadings = new ArrayList();
    List<Integer> scorePoint = new ArrayList();
    
    Map<String,Integer> newsMap=new HashMap();
   
			for(WebElement newsElement :newsElements ){
			System.out.println(newsElement.getText());
            newsHeadings.add(newsElement.getText());			
			}
			
			for(WebElement scoreElements : scorePoints) {
			System.out.println(scoreElements.getText().substring(0, scoreElements.getText().length()-7));
			scorePoint.add(Integer.parseInt(scoreElements.getText().substring(0, scoreElements.getText().length()- 7)));
			}
			
			for (int i = 0; i < newsElements.size(); i++) {
				System.out.println(newsElements.get(i));
//				System.out.println(Integer.parseInt(scorePoints.get(i)));
//				newsMap.put(newsElements.get(i), Integer.parseInt(scorePoints.get(i)));
			}
	}

}
