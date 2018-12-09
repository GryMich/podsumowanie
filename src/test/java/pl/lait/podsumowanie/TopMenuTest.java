package pl.lait.podsumowanie;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenuTest extends Common {

	@Test
	public void topMenu() {
		goToMainPage();
		
		linkClick("About");
		linkClick("Support");
		linkClick("Documentation");
		linkClick("Download");
		linkClick("Projects");
		findInputByName("q").sendKeys("szukany tekst");
		String h2xpath = "//*[@id=\"mainContent\"]/h2";
		String h2text = driver.findElement(By.xpath(h2xpath)).getText();
		System.out.println("######+h2text");
		if(h2text.equals("Selenium Projects")) {
			System.out.println("Znaleziono poprawny " + "komunikat na stronie");
		}
		
		//driver.quit();
	}
	
	/*@Test
	public void topMenu2() {
		WebDriver driver = Init.getDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		assertTrue("Page title is wrong!", title.equals("Getting Help"));

		driver.quit();
	}*/
	
	/*@Test
	public void topMenu2wrongTitle() {
		WebDriver driver = Init.getDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		
		title = driver.getTitle();
		
		System.out.println(title);
		
		assertTrue("Page title is wrong!", title.equals("Some wrong page title"));

		driver.quit();
	}*/
	
	

}