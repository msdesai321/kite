package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	WebDriver driver;
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Term Life']")
	private WebElement termlife;
	public void clicktermlife()
	{
		termlife.click();
	}
	
	@FindBy(xpath="(//i[@class='icon-bg homeIconsBg health-insurance'])[2]")
	private WebElement helthinsurance;
	public void clickHelthInsurance()
	{
		helthinsurance.click();
	}

	

}
