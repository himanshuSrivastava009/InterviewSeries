package selenium.interview.series;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndPerfromAction {

	
	public static void main(String[] args) {
		
		//Locators
		By SignUp = By.linkText("Sign up");
		By userName = By.id("sign-username");
		By password = By.id("sign-password");
		By signupButtom = By.xpath("//button[@class='btn btn-primary' and text()='Sign up']");
		By signupCloseButton = By.xpath("//h5[text()='Sign up']/ancestor::div//button[@class='btn btn-secondary' and text()='Close' and @type='button']");
		By loginButton = By.linkText("Log in");
		By loginButtonClcik = By.xpath("//button[@class='btn btn-primary' and text()='Log in']");
		By loginUserName = By.id("loginusername");
		By loginPassword = By.id("loginpassword");
		String myMesage = "This user already exist.";
		
		//Webdriver initialization
		WebDriver driver = new ChromeDriver();
		
		//deleting all cookies
		driver.manage().deleteAllCookies();
		//maximizing windows
		driver.manage().window().maximize();
		
		//navigating to URL
		driver.get("https://www.demoblaze.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		String demoBalzeWindowHandle = driver.getWindowHandle();
		System.out.println("Demo Blaze Window handle is " + demoBalzeWindowHandle);
		
		//click
		driver.findElement(SignUp).click();
		
		//Window handle i.e. ID of current window open tab
		String demoBalzeSignupWindowHandle = driver.getWindowHandle();
		System.out.println("Demo Blaze signUP Window handle is " + demoBalzeSignupWindowHandle);
		

		System.out.println(driver.getTitle());
		
		
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(userName)));
		
		driver.findElement(userName).sendKeys("himanshukumar9210");
		driver.findElement(password).sendKeys("test@123");
		
		driver.findElement(signupButtom).click();
		
		try {
			Thread.sleep(3000);
		}
		catch (Exception e) {
			
		}
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		
		//handling alert
		driver.switchTo().alert().dismiss();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(signupCloseButton)));
		driver.findElement(signupCloseButton).click();
		//driver.switchTo().defaultContent();
		if(message.equalsIgnoreCase(myMesage)) {
			try {
				Thread.sleep(3000);
			}
			catch (Exception e) {
				
			}
			//driver.findElement(signupCloseButton).click();
			System.out.println("Proceeding for Login");
			driver.findElement(loginButton).click();
			driver.findElement(loginUserName).sendKeys("himanshukumar9210");
			driver.findElement(loginPassword).sendKeys("test@123");
			driver.findElement(loginButtonClcik).click();
			
		}
		else {
			
			System.out.println("User already exists");
		}
		
		System.out.println(driver.getCurrentUrl());
	//	JavascriptExecutor exec = (JavascriptExecutor)driver;
	//	driver.executeScript("arguments[0].style.display='none';", popup);
		
		//closing the web-Browser
		
		
		/*
		 * Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(5000))
		 * .pollingEvery(Duration.ofSeconds(2000))
		 * .withMessage("Waiting for the visibility of Webelement")
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginPassword))
		 * );
		 */
		 
				
		
		driver.close();
		
		
	}
}
