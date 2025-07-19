package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.kwikklin.com/");
		Stopwatch  stop = Stopwatch.createStarted();
		try {
		
	        driver.findElement(By.xpath("//button[text()='Explore']")).click();
	        stop.stop();
	        System.out.println(stop.elapsed(TimeUnit.MILLISECONDS));
	    }
		
		catch(Exception e) {
			stop.stop();
			System.out.println(stop.elapsed(TimeUnit.SECONDS));
		}
		
		driver.quit();
	}

}

