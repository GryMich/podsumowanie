package pl.lait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {
	
	static WebDriver driver;
	
	public static void goToMainPage() {
		System.out.println("Uruchamiam przeglądarkę");
		driver = Init.getDriver();
	}
	
	public static void linkClick(String linkText) {
		System.out.println("Klikam w link: "+linkText);
		try {
			driver.findElement(By.linkText(linkText)).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Generuję print screen z błędem");
			Init.printScr(driver);
			assertTrue("Nie znalazłem linku: " + 
			linkText, false);
		} 
	}
	
	public static void checkPageTitleAndStopTestIfWrong(String title) {
		boolean checkStatus = driver.getTitle().equals(title);
		assertTrue("Trytuł strony jest nieprawidłowy", checkStatus);
	}
	
	public static WebElement findInputByName(String name) {
		return driver.findElement(By.name(name));
	}
}
