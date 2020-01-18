package Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.Facebook.com/");
	driver.close();
	
	
}
}
