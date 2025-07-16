package api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Datepicker {


	public static void main(String [] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.astrojini.com/register");

		driver.findElement(By.name("dob")).sendKeys("07/05/1998");
		driver.findElement(By.name("birth_time")).sendKeys("34:45AM");
		WebElement staticdrop =  driver.findElement(By.name("gender"));
		Select dropdown = new Select(staticdrop);
		dropdown.selectByVisibleText("Male");
		String result = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals("Male", result);

	}


}
