package com.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
   public  WebDriver driver;
   
	public void launchTheWeb() {
		
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		Properties properties = new Properties();
		
		properties.getProperty("weburl");
		
		driver.get(properties.getProperty("weburl1"));
		
	}

}
