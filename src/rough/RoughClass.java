package rough;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilityClass.ScreenshotClass;

public class RoughClass 
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
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
		
		driver.findElement(By.xpath("//p[text()='Term Life']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[@class='radio'])[2]")).click();
		
		
	}

}
