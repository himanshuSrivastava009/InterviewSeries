package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAndGetDriver {

	
	public WebDriver driver;
	
	
	public WebDriver initializeDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
		
		return driver;
	}
	
	public void terminateBrowser() {
		
		driver.quit();
	}
}
