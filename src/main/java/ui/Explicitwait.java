package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.kwikklin.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Explore']")));
        element.click();
	}

}
