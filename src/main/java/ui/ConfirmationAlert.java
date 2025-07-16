package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
	driver.switchTo().alert().dismiss();
	}

}
