package Testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLinkedin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.linkedin.com//");
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.name("session_key")).sendKeys("mecury");
	    driver.findElement(By.name("session_password")).sendKeys("mecury");
	    	    
	    driver.findElement(By.className("sign-in-form__submit-btn")).click();
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	}
	
}
