package ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {
	
	public static void main(String [] arg) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
driver.findElement(By.className("container"));

      //  TakesScreenshot ts = ((TakesScreenshot)driver);
        WebElement ts=driver.findElement(By.className("container"));// use this for take screenshot of any particular section
        File source = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Suyash\\eclipse-workspace\\SeleniumPractice\\src\\main\\java\\screenshot\\scr1.png");
        FileUtils.copyFile(source, des);
}
}