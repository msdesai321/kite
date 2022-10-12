package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermLifePOMClass 
{
	WebDriver driver;
	
	public TermLifePOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//i[@class='radio'])[1]")
	private WebElement maleradio;
	public void clickmaleradio()
	{
		boolean maleradi = maleradio.isSelected();
		if(maleradi!=true)
		{
			maleradio.click();
			System.out.println("Male radio is selected");
		}
		else
		{
			System.out.println("Male radio button is already selected");
		}
	}
	
	@FindBy(xpath="//input[@id='nameAdd']")
	private WebElement username;
	public void sendusername()
	{
		username.sendKeys("Mahesh Desai");
	}
	
	@FindBy(id="dob")
	private WebElement bithdate;
	public void sendBirthDate()
	{
		bithdate.sendKeys("04011994");
	}
	
	@FindBy(id="mobileNo")
	private WebElement mobno;
	public void sendMobNo()
	{
		mobno.sendKeys("9130996797");
	}
	
	@FindBy(xpath="//span[@class='proceed']")
	private WebElement viewfree;
	public void clickviewfree()
	{
		viewfree.click();
	}
	
	@FindBy(xpath="//input[@value='Salaried']")
	private WebElement salaried;
	public void clickSalaried()
	{
		salaried.click();
	}
	
	@FindBy(xpath="//li[@value='4']")
	private WebElement annualincome;
	public void click7to9()
	{
		annualincome.click();
	}
	
	@FindBy(xpath="(//li[@value='1'])[2]")
	private WebElement education;
	public void clickGraduate()
	{
		education.click();
	}
	
	@FindBy(xpath="//input[@value='No']")
	private WebElement smoke;
	public void clickNosmoke()
	{
		smoke.click();
	}
	
	
	

}
