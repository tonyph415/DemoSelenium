package Testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com//");
		    System.out.println(driver.getTitle());
		    
		    
		    // Dropdown using select:
		    Select day = new Select(driver.findElement(By.id("day")));
		    day.selectByIndex(10);
		    Select month = new Select(driver.findElement(By.id("month")));
		    month.selectByVisibleText("Jun");
		    Select year = new Select(driver.findElement(By.id("year")));
		    year.selectByValue("1999");
		     
		    
//		    System.out.println(driver.getTitle());
		    
		    driver.close();
		    
	}

}
