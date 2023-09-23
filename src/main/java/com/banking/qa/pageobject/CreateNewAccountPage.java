package com.banking.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;

public class CreateNewAccountPage extends Base{
	
	ActionDriver actionDriver=new ActionDriver();
	@FindBy(xpath="//input[@name='account_number']")
	WebElement accountNumber;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='generated_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='pin']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='balance']")
	WebElement balance;
	
	@FindBy(xpath="//button[@class='btn btn-primary mr-2']")
	WebElement save;
	
	
	
	
	public CreateNewAccountPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void save()
	{
		actionDriver.sendKeys(accountNumber,"12345");
		actionDriver.sendKeys(firstName,"Amanpreet");
		actionDriver.sendKeys(lastName,"Singh");
		actionDriver.sendKeys(email,"def@gmail.com");
		actionDriver.sendKeys(password,"abc123");
		actionDriver.sendKeys(pin,"140232");
		actionDriver.sendKeys(balance,"345654");
		actionDriver.actionClick(driver, save);
		
	}
	
	
	
	
	

}
