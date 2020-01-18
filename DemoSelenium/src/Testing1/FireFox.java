package Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://newtours.demoaut.com/");
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.name("userName")).sendKeys("mecury");
	    driver.findElement(By.name("password")).sendKeys("mecury");
	    	    
	    driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	    System.out.println(driver.getTitle());
	    
	    driver.close();
	}
	
	
	
	
}
