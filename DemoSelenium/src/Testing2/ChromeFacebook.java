package Testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com//");
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.id("email")).sendKeys("mecury");
	    driver.findElement(By.id("pass")).sendKeys("mecury");
	    	    
	    driver.findElement(By.partialLinkText("Forgot account?")).click();
	    
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	}
}
//
//driver.findElement(By.name("firstname")).sendKeys("mecury");
//driver.findElement(By.name("lastname")).sendKeys("mecury");
//driver.findElement(By.name("reg_email__")).sendKeys("mecury@mail.com");
//driver.findElement(By.name("reg_passwd__")).sendKeys("mecury.com");
//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mecury.com");
