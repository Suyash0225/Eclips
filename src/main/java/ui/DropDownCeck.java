package ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownCeck {
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
	    List<WebElement> alloptions = dropdown.getOptions();
	    System.out.println(alloptions.size());
	    List<String> optionsText= new ArrayList<>();
	    
	    
	    for(WebElement op : alloptions) {
	    	optionsText.add(op.getText().trim());
	    	
	    }
	    
	    List<String> expectedStates = Arrays.asList("ANDHRA_PRADESH","ARUNACHAL_PRADESH","ASSAM","BIHAR","CHHATTISGARH","DADARA","DAMAN",
	    	    "DELHI","GOA","GUJARAT","HARYANA","HIMACHAL_PRADESH","JAMMU_AND_KASHMIR","JHARKHAND","KARNATAKA","KERALA","MADHYA_PRADESH",
	    	    "MAHARASHTRA","MANIPUR","MEGHALAYA","MIZORAM","NAGALAND","ODISHA","PUDUCHERRY","PUNJAB","RAJASTHAN","SIKKIM","TAMIL_NADU",
	    	    "TELANGANA", "TRIPURA","UTTAR_PRADESH","UTTARAKHAND","WEST_BENGAL"
	    	);

	    Assert.assertTrue(optionsText.containsAll(expectedStates), "Dropdown is missing expected states.");

		driver.quit();
	}


}
