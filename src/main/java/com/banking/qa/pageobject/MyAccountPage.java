package com.banking.qa.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.qa.action.ActionDriver;
import com.banking.qa.base.Base;

public class MyAccountPage extends Base {
	ActionDriver actionDriver = new ActionDriver();

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='customFile']")
	WebElement browseImage;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	WebElement updateBtn;

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyProfileEditFunctionality(String nameFirst, String nameLast) {
		actionDriver.sendKeys(firstName, nameFirst);
		actionDriver.sendKeys(lastName, nameLast);
		actionDriver.actionClick(driver, updateBtn);

	}
}
