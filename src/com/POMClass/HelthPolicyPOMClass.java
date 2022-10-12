package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HelthPolicyPOMClass 
{
	WebDriver driver;
	Select s;
	Select s1;
	

	
	@FindBy(xpath="(//i[@class='checkbox'])[1]")
	private WebElement self;
	public void clickselfbox()
	{
		if(self.isSelected()==true)
		{
			System.out.println("self check box is selected");
		}
		else
		{
			self.click();
			System.out.println("self check box is selecte");
		}
	}
	
	@FindBy(xpath="(//i[@class='checkbox'])[2]")
	private WebElement spouse;
	public void clickSpouse()
	{
		spouse.click();
	}
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement submit;
	public void clickContinue1()
	{
		submit.click();
	}
	
	@FindBy(xpath="//select[@id='Self']")
	private WebElement selfage;
	public void selectAge()
	{
		s = new Select(selfage);
		s.selectByValue("28");
	}
	
	@FindBy(xpath="//select[@id='Spouse']")
	private WebElement spouseage;
	public void selectSpouseAe()
	{
		s1 = new Select(spouseage);
		s1.selectByValue("25");
	}
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement conti;
	public void clickContinue2()
	{
		conti.click();
	}
	
	@FindBy(xpath="//input[@id='txtcity']")
	private WebElement city;
	public void sendCityName()
	{
		city.sendKeys("Kolhapur");
	}
	
	@FindBy(xpath="//li[@class='active']")
	private WebElement search;
	public void clicksearchitem()
	{
		search.click();
	}
	
	@FindBy(xpath="//button[@id='continuecta3']")
	private WebElement conti1;
	public void clickContinue3()
	{
		conti1.click();
	}
	
	@FindBy(xpath="//i[@class='gender male']")
	private WebElement gender;
	public void clickGender()
	{
		gender.click();
	}
	
	@FindBy(xpath="//input[@id='fullname']")
	private WebElement name;
	public void sendName()
	{
		name.sendKeys("Mahesh Sayaji Desai");
	}
	
	@FindBy(xpath="//label[text()='Enter Mobile Number']")
	private WebElement mobno;
	public void sendMobNo()
	{
		mobno.sendKeys("9130996797");
	}
	
	@FindBy(xpath="//button[@id='continuecta3']")
	private WebElement conti2;
	public void clickContinue4()
	{
		conti2.click();
	}
	
	@FindBy(xpath="//label[text()='None of these']")
	private WebElement nonofthis;
	public void clickExistingillNess()
	{
		nonofthis.click();
	}
	
	@FindBy(xpath="//button[@id='viewplans']")
	private WebElement conti3;
	public void clickContinue5()
	{
		conti3.click();
	}
	
	public HelthPolicyPOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

	}
	
	
	
	
	
	
	
	
	
	

}
