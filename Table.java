package week4.day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> tableColumn = driver.findElements(By.xpath("//tr[1]/th"));
		System.out.println("column size " + (tableColumn.size()));
		List<WebElement> tableRow = driver.findElements(By.xpath("//tr"));
		System.out.println("Row size "  + (tableRow.size()));
		WebElement text = driver.findElement(By.xpath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]"));
		System.out.println("progress Value " + text.getText());
		WebElement vitalTask = driver.findElement(By.xpath("(//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td)[2]"));
		boolean check=vitalTask.isSelected();
		System.out.println(check);
		
		
		
	


	}

}
