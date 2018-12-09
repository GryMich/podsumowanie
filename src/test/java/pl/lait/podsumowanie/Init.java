package pl.lait.podsumowanie;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;


public class Init {

	static WebDriver driver; 
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MICHAŁ\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		driver.get("https://www.seleniumhq.org");
		
		return driver; 
	}

	public static void printScr(WebDriver driver) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis()); // timestamp to zmienna, która przechowuje date 
		Long milis = timestamp.getTime(); // pobiera aktualny czas w milisekundach

		WebDriver driver_tmp = new Augmenter().augment(driver); 
		File srcFile = ((TakesScreenshot)driver_tmp).getScreenshotAs(OutputType.FILE); // to robi screenshoty

		try {
			FileUtils.copyFile(srcFile, new File("target/Screeny/screenshot-"+milis+".png")); //w targecie będą pojawiały się screenshoty z nazwa w milisekundach w formacie png
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void printScr(WebDriver driver, String folderName, String testName) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis()); // timestamp to zmienna, która przechowuje date 
		Long milis = timestamp.getTime(); // pobiera aktualny czas w milisekundach

		WebDriver driver_tmp = new Augmenter().augment(driver); 
		File srcFile = ((TakesScreenshot)driver_tmp).getScreenshotAs(OutputType.FILE); // to robi screenshoty

		try {
			FileUtils.copyFile(srcFile, new File("target/"+ folderName+"/"+ testName +"-" + milis + ".png")); //w targecie będą pojawiały się screenshoty z nazwa w milisekundach w formacie png
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
