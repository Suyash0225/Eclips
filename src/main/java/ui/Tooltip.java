package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/tool-tips.php");
	String value = driver.findElement(By.xpath("//button[@title='Tooltip on top']")).getAttribute("title");
	System.out.println(value);
	String expectedtooltip= "Tooltip on top";
	
	Assert.assertEquals(value, expectedtooltip);
	}

}
