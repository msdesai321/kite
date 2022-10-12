package testCasesforHome;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POMClass.HomePOMClass;
import com.POMClass.TermLifePOMClass;

import utilityClass.ScreenshotClass;

public class TC02_VerifyTermLifeInsurence extends BaseClass
{
	
	@Test
	public void verifyHomePage() throws IOException, InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		HomePOMClass m1 = new HomePOMClass(driver);
		m1.clicktermlife();
		Thread.sleep(3000);
		
		TermLifePOMClass m2 = new TermLifePOMClass(driver);
		m2.clickmaleradio();
		m2.sendusername();
		m2.sendBirthDate();
		m2.sendMobNo();
		ScreenshotClass.screenshotmethod(driver, "DataFill");
		m2.clickviewfree();
		Thread.sleep(5000);
		ScreenshotClass.screenshotmethod(driver, "TermLifePage");
		
//		Apply validation
		String expectedpagetilte = "Term Life Insurance - Compare & Buy Life Insurance Online";
		String actualpagetitle = driver.getTitle();
		Assert.assertEquals(expectedpagetilte, actualpagetitle);	
		
		m2.clickSalaried();
		m2.click7to9();
		m2.clickGraduate();
		m2.clickNosmoke();
	}

}
