package dailyPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login {

	public static void main(String [] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dr =driver.findElement(By.id("dropdown"));
	    Select drop = new Select(dr);
	    List<WebElement> option = drop.getOptions();
	    for(WebElement er : option) {
	    	if(!er.getAttribute("Value").equals("")) {
	      System.out.println(er.getText());
	  
	    	}
	    }
		
	}
	
	
}