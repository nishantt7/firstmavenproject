package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.*;
import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
//import com.crm.qa.utility.TestngscreenshotListener;

//@Listeners(TestngscreenshotListener.class)
public class Homepagetest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	public Homepagetest() throws IOException
	{
		super();
	}
	@BeforeSuite
	public void setup() throws IOException
	{
		initialization();
	    loginpage=new Loginpage();
	    loginpage.logincredentials(prop.getProperty("username"),prop.getProperty("password"));
		homepage=new Homepage();
	}
	@Test
	public void contactbuttontest() 
	{
		Assert.assertTrue(homepage.contactbtncheck());
	}
//	@Test(priority=1)
//	public void logintest() 
//	{
//		homepage.logincredentials(prop.getProperty("username"),prop.getProperty("password"));
//	}
	@Test
	public void dealsbuttontest() 
	{
		Assert.assertTrue(homepage.Dealsbtncheck());
	}
	@Test
	public void Tasksbuttontest() 
	{
		Assert.assertTrue(homepage.Tasksbtncheck());
	}
	@Test
	public void homepagesidegridtest()
	{
		int x=homepage.homepagesidegrid();
		System.out.println(x);
	}
	@AfterSuite
	public void teardown()
	{
		loginpage.teardown();
	}
}