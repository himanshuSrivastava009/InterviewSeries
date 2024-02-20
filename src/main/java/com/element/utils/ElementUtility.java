package com.element.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {

	public WebDriver driver;
	
	public ElementUtility(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getWebElement(By locator) {
		
		
		return driver.findElement(locator);
	}
}
