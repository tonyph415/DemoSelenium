package Testing1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;




	public class Chrome {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tony\\Desktop\\Testing\\WebDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		    driver.get("http://www.google.com/");
		    Thread.sleep(5000);  // Let the user actually see something!
		    System.out.println(driver.getTitle());
		    WebElement searchBox = driver.findElement(By.name("q"));
		    searchBox.sendKeys("Selenium");
		    searchBox.submit();
		    Thread.sleep(5000);  // Let the user actually see something!
		    driver.quit();
			
			
			
		}

		
		
		
	}

