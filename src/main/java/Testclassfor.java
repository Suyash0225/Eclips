import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testclassfor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.astrojini.com/login");

        // Hover over the dropdown (assuming there's a dropdown trigger)
        WebElement dropdownTrigger = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown")));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownTrigger).perform();

        // Wait for the dropdown-content to be visible and clickable
        WebElement dropdownContent = wait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-content")));
        dropdownContent.click();
    }
}
