package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) 
	
	{

		
		System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");

		
	}

}
