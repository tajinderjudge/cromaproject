package com.banking.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;

public class LoginPage extends Base {
	
	
	

	ActionDriver actionDriver = new ActionDriver();
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifyLoginWithValidUsernameAndValidPassword(String userId,String pass)
	{
     
       
	  actionDriver.sendKeys(userName,userId);
	  actionDriver.sendKeys(password, pass);
	  actionDriver.actionClick(driver, loginBtn);
	  Reporter.log("login test passed");

	
	}
	
	
}
