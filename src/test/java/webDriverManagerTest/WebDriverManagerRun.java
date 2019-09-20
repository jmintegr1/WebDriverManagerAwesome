package webDriverManagerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerRun {
	WebDriver driver;	
	
	@BeforeMethod
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//driver = new ChromeDriver();
	    driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void goToMSNBCDotcom(){
		driver.get("http://msnbc.com");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}	

}
