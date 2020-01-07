package com.crm.qa.base;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.utility.Timeouts;
import com.crm.qa.utility.WebEventListener;

public class Testbase {
	public static Properties prop;
	public static WebDriver driver;
	public static WebEventListener eventlistener;
	public static EventFiringWebDriver ef_driver;
	
	public Testbase() throws IOException
	{
		try
		{
	    prop=new Properties();
		FileInputStream abc=new FileInputStream("C:\\eclipse\\firstmavenproject\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"); 
		prop.load(abc);
	    }
		catch(FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void initialization() throws IOException 
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.8.1\\chromedriver.exe");
			driver=new ChromeDriver();
		} 
		else if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium-java-3.8.1\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		eventlistener=new WebEventListener();
		ef_driver=new EventFiringWebDriver(driver);
		ef_driver.register(eventlistener);
		driver=ef_driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timeouts.pageloadtimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Timeouts.pageloadtimeout,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	public static void takescreenshot(String testmethodname) throws IOException 
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YY-MM-DD HH:MM:SS");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\eclipse\\firstmavenproject\\screenshot"+sdf.format(d)+testmethodname+".jpg"));
	}
}
	
