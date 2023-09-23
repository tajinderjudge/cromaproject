package com.banking.qa.pagetest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.pageobject.DashboardPage;
import com.banking.qa.pageobject.LoginPage;

public class DashboardPageTest extends Base{

LoginPage loginPage;
DashboardPage dashboardPage;
	
	public DashboardPageTest()
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
	}
	@Test
	public void verifyLogoutTest()
	{
		dashboardPage.verifyLogout();
	}
	@Test
	public void verifyAccountManagementFunctionalityTest()
	{
		dashboardPage.verifyAccountManagementFunctionality();
	}
	@Test
	public void verifyMyAccountTest()
	{
		dashboardPage.verifyMyAccount();
	}
	@Test
	public void createNewAccountTest()
	{
		dashboardPage.verifyCreateAccountOption();
	}
}
