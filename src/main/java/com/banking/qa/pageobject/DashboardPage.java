package com.banking.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;

public class DashboardPage extends Base {
	ActionDriver actionDriver = new ActionDriver();
	
	@FindBy(xpath="//span[contains(text(),'Adminstrator Admin')]")
	WebElement dropdown;
	
	@FindBy(xpath="//p[contains(text(),'Transfer')]")
	WebElement transfer;
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]")
	WebElement logoutBtn;
	
	@FindBy(xpath="//p[contains(text(),'Account Management')]")
	WebElement accountManagement;
	
	@FindBy(xpath="//a[@href=\"http://localhost/banking/admin/?page=user\"]")
	WebElement myAccount;
	@FindBy(xpath="//p[contains(text(),'New Account')]")
	WebElement createNewAccount;
	@FindBy(xpath="(//p[contains(text(),'Transaction')])[1]")
	WebElement transaction;
	
	@FindBy(xpath="//p[contains(text(),'Transactions')]")
	WebElement Transactions;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyLogout()
	{
		actionDriver.ownSleep(5000);
		actionDriver.actionClick(driver, dropdown);
		actionDriver.ownSleep(2000);
		actionDriver.actionClick(driver, logoutBtn);

	}
	public void verifyMyAccount()
	{
		actionDriver.ownSleep(5000);
		actionDriver.actionClick(driver, dropdown);
		actionDriver.ownSleep(2000);
		actionDriver.actionClick(driver, myAccount);
	}
	
	public void verifyAccountManagementFunctionality()
	{
		actionDriver.actionClick(driver, accountManagement);
	}
	public void verifyCreateAccountOption()
	{
		actionDriver.actionClick(driver, accountManagement);
		
		actionDriver.actionClick(driver, createNewAccount);
     }
	
	public void transactionOptions()
	{
		actionDriver.actionClick(driver, transaction);
		//actionDriver.actionClick(driver, transfer);
	}
}
