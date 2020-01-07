package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Dealspage extends Testbase {
	
	@FindBy(xpath="//td[contains(text(),'Deals')]")
	WebElement Dealsbtn;
	@FindBy(xpath="//Select[@name='by_user']/option[contains(text(),'Nishant Tuli')]")
	WebElement Owner;
	
	public Dealspage() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	public boolean dealsbtncheck() {
		return Dealsbtn.isDisplayed();
	}
	public boolean ownercheck() {
		return Owner.isDisplayed();
	}
}
