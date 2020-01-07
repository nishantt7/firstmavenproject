package com.crm.qa.testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Dealspage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.Timeouts;
//import com.crm.qa.utility.TestngscreenshotListener;

//@Listeners(TestngscreenshotListener.class)
public class Dealspagetest extends Testbase{
	Loginpage loginpage;
	Dealspage dealpage;
	public Dealspagetest() throws IOException
	{
		super();
	}
	@BeforeSuite
	public void setup() throws IOException {
		initialization();
		loginpage=new Loginpage();
		dealpage=new Dealspage();
		loginpage.logincredentials(prop.getProperty("username"),prop.getProperty("password"));
		Timeouts.switchtoframe("mainpanel");
		driver.findElement(By.xpath("//a[@title='Deals']")).click();
	}
	@Test
    public void dealstexttest() {
    	dealpage.dealsbtncheck();
    }
	@Test
    public void ownertexttest() {
    	dealpage.ownercheck();
    }
    @AfterSuite
    public void teardown()
	{
		driver.quit();
	}
}
