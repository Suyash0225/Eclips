package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Suyash");
	alert.accept();


	}

}
