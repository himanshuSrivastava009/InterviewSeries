package com.saucelabs.login;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.element.utils.ElementUtility;

public class LoginPage {

	public WebDriver driver;
	ElementUtility webElement;
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		webElement = new ElementUtility(driver);
	}
	
	private By usernameInput = By.id("user-name");
	private By passwordInput = By.id("password");
	private By loginButton = By.id("login-button");
	private final String url = "https://www.saucedemo.com/";
	
	public void doLogin(String username, String password) throws IOException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		takeScreenShot(driver);
		webElement.getWebElement(usernameInput).sendKeys(username);
		webElement.getWebElement(passwordInput).sendKeys(password);
		webElement.getWebElement(loginButton).click();
		driver.quit();
	}
	
	
	public static void takeScreenShot(WebDriver driver) throws IOException {
		
	File file	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir");
	File dest = new File(destination+"/"+System.currentTimeMillis()+".png");
	String fullPath = destination+"/"+System.currentTimeMillis();
	FileUtils.copyFile(file, dest);
	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.doLogin("abc", "xyz");
	}
}
