package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement loc = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		WebElement serch =  driver.findElement(By.xpath("//input[@name='btnK']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Suyash'", loc);
	    js.executeScript("arguments[0].click();", serch);
		

	}

}
