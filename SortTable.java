package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
	    List<WebElement>ValueoftableName=  driver.findElements(By.xpath("//td[2]"));
	    for(WebElement eachElement : ValueoftableName) {
	    	System.out.println(eachElement.getText());
	    }
	    List<WebElement>ValueoftableStore=  driver.findElements(By.xpath("//td[3]"));
	    for(WebElement eachElement : ValueoftableStore) {
	    	System.out.println(eachElement.getText());
	    }
	    driver.findElement(By.className("sorting")).click();
	    List<WebElement>ValueoftableName1=  driver.findElements(By.xpath("//td[2]"));
	    for(WebElement eachElement : ValueoftableName1) {
	    	System.out.println(eachElement.getText());
	    	
	    }
	    



	}}
