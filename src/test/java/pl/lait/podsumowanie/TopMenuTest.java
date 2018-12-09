package pl.lait.podsumowanie;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

public class TopMenuTest {

	@Test
	public void topMenu() {
		String testName = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		WebDriver driver = Init.getDriver();
		Init.printScr(driver, "TopMenuTest", testName);
		driver.findElement(By.linkText("About")).click();
		Init.printScr(driver, "TopMenuTest", testName);
		//Init.printScr(driver);
		driver.quit();
	}
	
	@Test
	public void topMenu2() {
		
		WebDriver driver = Init.getDriver();
		driver.findElement(By.linkText("Support")).click();
		Init.printScr(driver);
		driver.quit();
	}
}
