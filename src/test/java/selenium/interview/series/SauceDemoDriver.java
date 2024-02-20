package selenium.interview.series;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.saucelabs.login.LoginPage;
import com.selenium.driver.LaunchBrowserAndGetDriver;

public class SauceDemoDriver extends LaunchBrowserAndGetDriver{

	static SauceDemoDriver getDriver = new SauceDemoDriver();
	static WebDriver driver;
	By burgerButton = By.cssSelector("#react-burger-menu-btn");
	By logoutOption = By.xpath("//div[@class='bm-menu']/nav/a[@id='logout_sidebar_link']");
	By homePageProductLists = By.xpath("//div[@id='inventory_container']//a/div");
	
	@Test(priority = 1, dataProvider = "LoginTestData")
	public void loginTest(String userName, String password) throws IOException {
		
		driver = getDriver.initializeDriver("Chrome");
		LoginPage login = new LoginPage(driver);
		login.doLogin(userName,password);
		System.out.println("URL == " +driver.getCurrentUrl());
		homePageTest();
	}
	
	@Test
	public void homePageTest() {
		
		 List<WebElement> findElements = driver.findElements(homePageProductLists);
		 
		 for(WebElement elem : findElements) {
			 System.out.println(elem.getText());
		 }

		driver.findElement(burgerButton).click();
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			
		}
		
		driver.findElement(logoutOption).click();
	}
	
	@DataProvider(name = "LoginTestData")
	public Object[][] loginData(){
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"}
		};
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
