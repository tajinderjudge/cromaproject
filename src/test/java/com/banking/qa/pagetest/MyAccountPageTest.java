package com.banking.qa.pagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.pageobject.DashboardPage;
import com.banking.qa.pageobject.LoginPage;
import com.banking.qa.pageobject.MyAccountPage;

public class MyAccountPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	MyAccountPage myAccountPage;
	
	public MyAccountPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
		loginPage.verifyLoginWithValidUsernameAndValidPassword(prop.getProperty("userid"), prop.getProperty("password"));
	    dashboardPage = new DashboardPage();
	    dashboardPage.verifyMyAccount();
	    myAccountPage= new MyAccountPage();
	}
	@Test
	public void verifyProfileEditFunctionalityTest()
	{
		myAccountPage.verifyProfileEditFunctionality("Tajendra","Singh");
	}
	
}
