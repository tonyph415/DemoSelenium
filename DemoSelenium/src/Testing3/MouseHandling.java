package Testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) {
		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.hdfcbank.com/");
		    System.out.println(driver.getTitle());
		    
//		   WebElement a = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a"));
//		   WebElement b =  driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[3]/a/span"));
//		   Actions action = new Actions(drive);
//		   
		    Actions actions = new Actions(driver);
			 WebElement moveonmenu = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
			 actions.moveToElement(moveonmenu);
			 actions.perform();
			 moveonmenu.click();

	}

}
