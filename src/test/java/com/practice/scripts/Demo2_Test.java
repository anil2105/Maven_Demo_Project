package com.practice.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2_Test 
{
	public WebDriver driver;
	
	@Test
	public void testCase1() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup(); 
						//-->not required for Selenium version 2.53.0
						//-->FireFoxDriver()-->it should be below 39 version
		
		driver=new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("http://localhost/login.do");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testCase2() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.close();
	}
}
