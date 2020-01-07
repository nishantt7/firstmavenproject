package com.crm.qa.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.*;
import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
//import com.crm.qa.utility.TestngscreenshotListener;

//@Listeners(TestngscreenshotListener.class)
public class Loginpagetest extends Testbase {
	Loginpage loginpage;
	Homepage homepage;
	public Loginpagetest() throws IOException
	{
		super();
	}
	@BeforeSuite
	public void  setup() throws IOException
	{
		initialization();
		loginpage=new Loginpage();
	}
	/*@Test
	public void loginpagetitletest() 
	{
	      String title=loginpage.validatelogintitle();
	      Assert.assertEquals(arg0, arg1);
	}*/
	@Test
	public void crmlogotest()
	{
	     Assert.assertTrue(loginpage.validateCRMImage());
	}
	@Test
	public void pricngbuttontest() 
	{
		Assert.assertTrue(loginpage.pricngbutton());
	}
	@Test
	public void Featuresbuttontest() 
	{
		Assert.assertTrue(loginpage.Featuresbutton());
	}
	@Test
	public void Customersbuttontest() 
	{
		Assert.assertTrue(loginpage.Customersbutton());
	}
	@Test
	public void contactbuttontest() 
	{
		Assert.assertTrue(loginpage.Customersbutton());
	}
	@Test
	public void logintest() throws IOException 
	{
		//homepage=
				loginpage.logincredentials(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterSuite
	public void teardown()
	{
     loginpage.teardown();
	}
}	



	
	
	



