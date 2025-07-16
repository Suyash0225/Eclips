package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Locator {
	public static void main(String [] args){



		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://eudyogaadhaar.org/print-udyog-aadhaar-certificate.php");
		driver.navigate().refresh();
	    WebElement dr= driver.findElement(By.cssSelector("select[id='office-state']"));
	    Select dropdown = new Select(dr);
	    dropdown.selectByValue("Assam");

		driver.quit();
	}



}
