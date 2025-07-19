package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();

	        driver.get("https://www.rediff.com/");
	        driver.switchTo().frame("moneyiframe");
	       String value = driver.findElement(By.id("nseindex")).getText();
	       System.out.println(value);
	       
	}

}
