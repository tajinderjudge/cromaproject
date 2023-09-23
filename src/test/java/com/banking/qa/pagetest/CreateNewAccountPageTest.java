package com.banking.qa.pagetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.banking.qa.base.Base;
import com.banking.qa.pageobject.CreateNewAccountPage;
import com.banking.qa.pageobject.DashboardPage;
import com.banking.qa.pageobject.LoginPage;

public class CreateNewAccountPageTest extends Base {
	
	
	CreateNewAccountPage createNewAccountPage;
	LoginPage loginPage;
	DashboardPage dashboardpage;
	public CreateNewAccountPageTest()
	{
		super();
		
	}
	
	@BeforeTest
	public void setup() throws Throwable
	{
		initialization();
		//CreateNewAccountPage cNewAccountPage = new CreateNewAccountPage();
		//LoginPage loginPage;
		loginPage = new LoginPage();
		loginPage.verifyLoginWithValidUsernameAndValidPassword(prop.getProperty("userid"), prop.getProperty("password"));
		dashboardpage= new DashboardPage();
		dashboardpage.verifyCreateAccountOption();
		createNewAccountPage=new CreateNewAccountPage();
		
		
		
		
		
	}
	
	@Test
	public void verifyCreateAccountWithValidData()
	{
		//loginPage = new LoginPage();
		//loginPage.verifyLoginWithValidUsernameAndValidPassword(prop.getProperty("userid"), prop.getProperty("password"));
		createNewAccountPage.save();
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
