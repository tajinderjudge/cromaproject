package com.banking.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;

public class TrasactionPage extends Base{
	
	
ActionDriver actionDriver=new ActionDriver();

@FindBy(name="account_number")
WebElement accountNumber;

@FindBy(name="transfer_number")
WebElement transfer;

@FindBy(name="balance")
WebElement ammount;

@FindBy(xpath="//button[contains(text(),'Submit')]")
WebElement submit;

public TrasactionPage()
{
	PageFactory.initElements(driver,this);
}

public void deposit()
{
	actionDriver.sendKeys(accountNumber,"6231415");
	actionDriver.sendKeys(ammount,"2354");
	actionDriver.actionClick(driver,submit);
	//actionDriver.actionClick(driver,submit);
	
}



}
