package pl.lait.podsumowanie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Init {

	static WebDriver driver; 
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MICHAŁ\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		driver.get("https://www.seleniumhq.org");
		
		return driver; 
	}
}
