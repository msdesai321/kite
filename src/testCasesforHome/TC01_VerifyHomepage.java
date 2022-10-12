package testCasesforHome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyHomepage  extends BaseClass
{
	@Test
	public void verifyHomePage() 
	{
		//Apply validation
		String expectedpagetilte = "Insurance - Compare & Buy Insurance Plans – Health, Term, Life, Car";
		String actualpagetitle = driver.getTitle();
		Assert.assertEquals(expectedpagetilte, actualpagetitle);	
		
	}

}
