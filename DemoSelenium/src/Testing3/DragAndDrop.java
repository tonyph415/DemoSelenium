package Testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://jqueryui.com/droppable/");
	    System.out.println(driver.getTitle());
	    
	    driver.switchTo().frame(0);
	    Actions actions = new Actions(driver);
	    actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
	    .moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
	    		.release().build().perform();
	    		
	    driver.quit();

	}

}
