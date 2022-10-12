package testCasesforHome;

import java.time.Duration;

import org.testng.annotations.Test;

import com.POMClass.HelthPolicyPOMClass;
import com.POMClass.HomePOMClass;

public class TC03_VerifyHelthInsurance extends BaseClass
{
	@Test
	public void VerifyHelthInsurance() throws InterruptedException
	{
		HomePOMClass m1 = new HomePOMClass(driver);
		m1.clickHelthInsurance();
		Thread.sleep(3000);
		
		HelthPolicyPOMClass m2 = new HelthPolicyPOMClass(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		m2.clickselfbox();
		m2.clickSpouse();
		m2.clickContinue1();
		System.out.println("age window open");
		m2.selectAge();
		m2.selectSpouseAe();
		m2.clickContinue2();
		System.out.println("city window open");	
		m2.sendCityName();
		m2.clicksearchitem();
		
		m2.clickContinue3();
		System.out.println("name page is opened");
//		m2.clickGender();
		m2.sendName();
		m2.sendMobNo();
		System.out.println("mob no is inserted");
		Thread.sleep(3000);
		m2.clickContinue4();
		m2.clickExistingillNess();
		
	}
	

}
