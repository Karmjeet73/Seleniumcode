package parleeltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver; // Declare WebDriver at the class level

	@Test
	void chrometest() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // Initialize WebDriver instance
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();// Perform test actions here
	}

	@Test
	void firefox() throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); // Initialize WebDriver instance
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
		// Perform test actions here
	}

	@Test
	void edgegoogle() throws InterruptedException {
		WebDriver driver = new EdgeDriver(); // Initialize WebDriver instance
		driver.get("https://www.google.com");
		driver.quit();// Perform test actions here
	}

	@Test
	void edgefb() throws InterruptedException {
		WebDriver driver = new EdgeDriver(); // Initialize WebDriver instance
		driver.get("https://www.fb.com");
		driver.quit();// Perform test actions here
	
	}
}
