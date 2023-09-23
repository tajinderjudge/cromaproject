package com.banking.qa.pagetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;
import com.banking.qa.pageobject.DashboardPage;
import com.banking.qa.pageobject.LoginPage;
import com.banking.qa.pageobject.TrasactionPage;

public class TransactionPageTest extends Base{

	//ActionDriver actionDriver =new ActionDriver();
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	TrasactionPage tranPage;
	
	public TransactionPageTest()
	{
		super();
	}
	@BeforeTest
	public void setup ()throws Throwable 
	{
		initialization();
		loginPage = new LoginPage();
		loginPage.verifyLoginWithValidUsernameAndValidPassword(prop.getProperty("userid"), prop.getProperty("password"));
		dashboardPage= new DashboardPage();
		dashboardPage.transactionOptions();
		
		
	}
	
	@Test
	public void deposit() 
	
	{
		tranPage=new TrasactionPage();
		tranPage.deposit();
		
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		//driver.close();
	}
	

}
