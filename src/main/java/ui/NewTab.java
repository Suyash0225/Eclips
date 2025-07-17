package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kwikklin.com/");
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main Window Handle: " + mainWindow);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/Suyash0225/Astrojini");
		
	   Set<String> windowhandel = driver.getWindowHandles();
	   List<String> handels = new ArrayList<String>();
	   handels.addAll(windowhandel);

	   driver.switchTo().window(handels.get(0));
	}

}
