package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousePerforme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement doub= driver.findElement(By.id("doubleClickBtn"));
		WebElement right = driver.findElement(By.id("rightClickBtn"));
       
		Actions ac =  new Actions(driver);
		ac.contextClick(right).perform();
		ac.doubleClick(doub).perform();
	}

}
