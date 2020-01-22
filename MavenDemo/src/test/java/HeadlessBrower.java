import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://half.ebay.com/");
		System.out.println("Title of the page is "+driver.getTitle());

			

		

		
	}

}
