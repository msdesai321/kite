package testCasesforHome;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilityClass.ScreenshotClass;

public class BaseClass2 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\mahii\\download\\Browser\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Driver is opened");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.policybazaar.com/");
		System.out.println("Home Page is opened");
		ScreenshotClass.screenshotmethod(driver, "HomePage");
		
	}
	
	@AfterMethod
	public void tearDown ()
	{
		System.out.println("End of the programe");
		driver.quit();
		System.out.println("Driver is closed");
	}

}
