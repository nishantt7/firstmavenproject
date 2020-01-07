package com.crm.qa.pages;

import java.util.List;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.Testbase;
import com.crm.qa.utility.Timeouts;

public class Homepage extends Testbase
{
	/*@FindBy(linkText="Contacts")
	WebElement contactbtn;
	@FindBy(linkText="Deals")
	WebElement Dealsbtn;
	@FindBy(linkText="Tasks")
	WebElement Tasksbtn;*/
	@FindBy(xpath="//input[@type='submit'][@value='Login']")
	WebElement loginbtn;
//	@FindBy(name="username")
//	WebElement username;
//	@FindBy(name="password")
//	WebElement password;
	
	public Homepage() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
//	public void logincredentials (String un,String pwd) 
//	{
//		username.sendKeys(un);
//		password.sendKeys(pwd);	
//		Actions actions = new Actions(driver);
//		actions.moveToElement(loginbtn).click().build().perform();
//	}
	public Boolean Dealsbtncheck() {
		Timeouts.switchtoframe("mainpanel");
		WebElement a=driver.findElement(By.xpath("//td[@class='logo_text']"));
		return a.isDisplayed();
	}
	public int homepagesidegrid() {
		List<WebElement> li=driver.findElements(By.xpath("//div[@id='navMenu']/ul/li"));
		int num=li.size();
		return num;
	}
	public boolean contactbtncheck() 
	{
		Timeouts.switchtoframe("mainpanel");
		WebElement a=driver.findElement(By.xpath("//a[@title='Contacts']"));
		return a.isDisplayed();
	}
	public boolean Tasksbtncheck() 
	{
		Timeouts.switchtoframe("mainpanel");
		WebElement a=driver.findElement(By.xpath("//a[@title='Tasks']"));
		return a.isDisplayed();
	}
}
