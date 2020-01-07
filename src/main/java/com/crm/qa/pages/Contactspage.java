package com.crm.qa.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.crm.qa.base.Testbase;

public class Contactspage extends Testbase{
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactbtn;
	@FindBy(id="first_name")
	WebElement firstnamee;
	@FindBy(id="surname")
	WebElement surname;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement company;
	
	public Contactspage() throws IOException 
	{
		PageFactory.initElements(driver,this);
	}
	public void contactbtnclick() 
	{
		contactbtn.click();
	}
	public void createcontact(String title, String firstname,String lastname, String companyy)
	{
		Select select=new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstnamee.sendKeys(firstname);
		surname.sendKeys(lastname);
        company.sendKeys(companyy);
	}	
}

