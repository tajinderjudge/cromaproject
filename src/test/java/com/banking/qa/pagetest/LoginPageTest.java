package com.banking.qa.pagetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.banking.qa.base.Base;
import com.banking.qa.pageobject.LoginPage;


public class LoginPageTest extends Base {

	LoginPage loginPage;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
	}
	@Test
	public void verifyLoginWithValidUsernameAndValidPassword()
	{
		loginPage.verifyLoginWithValidUsernameAndValidPassword(prop.getProperty("userid"),prop.getProperty("password"));
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
}
