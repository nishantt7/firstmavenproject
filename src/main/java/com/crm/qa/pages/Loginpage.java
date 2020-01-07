package com.crm.qa.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase 
{		
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit'][@value='Login']")
	WebElement loginbtn;
	@FindBy(linkText="Sign Up")
	WebElement signupbtn;
	@FindBy(xpath="//img[@class='img-responsive'][@src='https://classic.crmpro.com/img/logo.png']")
	WebElement crmlogo;
	@FindBy(linkText="Pricing")
	WebElement Pricingbtn;
	@FindBy(linkText="Features")
	WebElement Featuresbtn;
	@FindBy(linkText="Customers")
	WebElement Customersbtn;
	@FindBy(linkText="Contact")
	WebElement contactbtn;
	
	public Loginpage() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	public String validatelogintitle()
	{
		return driver.getTitle();
	}	
	public Boolean validateCRMImage()
	{
		return crmlogo.isDisplayed();
	}		
	public void logincredentials (String un,String pwd) throws IOException 
	{
		username.sendKeys(un);
		password.sendKeys(pwd);	
		Actions actions = new Actions(driver);
		actions.moveToElement(loginbtn).click().build().perform();
		//return new Homepage();
	}
	/*public void logincredentials (String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);	
		Actions actions = new Actions(driver);
		actions.moveToElement(loginbtn).click().build().perform();
		//loginbtn.click();
	}*/
	public Boolean pricngbutton()
	{
		return Pricingbtn.isDisplayed();
	}
	public Boolean Featuresbutton()
	{
		return Featuresbtn.isDisplayed();
	}
	public Boolean Customersbutton()
	{
		return Customersbtn.isDisplayed();
	}
	public Boolean contactbutton()
	{
		return contactbtn.isDisplayed();
	}
	public void teardown()
	{
		driver.quit();
	}
}
	

	
	
	
	
	

