import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class uiPractice {
	public static void main(String [] args) throws InterruptedException
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);	
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		List<WebElement> drop = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
		System.out.println(drop.size());
		 if(drop.size()>= 2) {
			 WebElement first = drop.get(1);
			 if (!first.isSelected()) {
	                first.click();
	            }
			 
			 if(first.isSelected()) {
				 System.out.println("Box Selected:");
			 }
			 else {
				 System.out.print("Not Selected");
			 }
			 
			 }
		 else {
			 System.out.println("Box size is less");
		 }
		 
		
	     
	    driver.quit();
	}
}
