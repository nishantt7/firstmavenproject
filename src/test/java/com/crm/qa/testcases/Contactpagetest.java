package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Dealspage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.Timeouts;
//import com.crm.qa.utility.TestngscreenshotListener;

//@Listeners(TestngscreenshotListener.class)
public class Contactpagetest extends Testbase{
	Loginpage loginpage;
	Dealspage dealpage;
	Contactspage contactpage;
	String sheetname="testdata";
	public Contactpagetest() throws IOException {
		super();
	}
	@BeforeSuite
	public void setup() throws IOException, InterruptedException {
		initialization();
		loginpage=new Loginpage();
		loginpage.logincredentials(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(4000);
		Actions abc=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		abc.moveToElement(a);
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
		b.click();
	}
	@DataProvider
	public Object[][] testdata() throws IOException{
		Object data[][]=Timeouts.getdata(sheetname);
		return data;
	}
	@Test(dataProvider="testdata")
	public void createcontacttest(String title,String firstname,String lastname,String company) {
		contactpage.createcontact(title, firstname, lastname, company);
	}
	@Test
	public void print() {
	System.out.println("hello");
}
}