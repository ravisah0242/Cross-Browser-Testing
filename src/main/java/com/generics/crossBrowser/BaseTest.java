package com.generics.crossBrowser;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstants
{
	public WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void openApp(String browser)
	{
		/*System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();	//Dependency code its Automatically load WebDriver;
		driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);*/
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();	//Dependency code its Automatically load WebDriver;
			driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();	//Dependency code its Automatically load WebDriver;
			driver=new FirefoxDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		else 
		{
			WebDriverManager.edgedriver().setup();	//Dependency code its Automatically load WebDriver;
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
	}
	
	@BeforeMethod
	public void enterURL()
	{
		driver.get(url);
	}
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}


}
