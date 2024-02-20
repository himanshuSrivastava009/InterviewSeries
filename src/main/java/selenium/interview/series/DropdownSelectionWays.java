package selenium.interview.series;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DropdownSelectionWays {

	protected static final Logger logger = LogManager.getLogger();
	public static void main(String[] args) throws InterruptedException {
		
		
		logger.info("Locators are here ");
		
		By createNewAccount = By.linkText("Create new account");
		By dayLocator = By.xpath("//select[@id='day']/option");
		By monthLocator = By.xpath("//select[@id='month']/option");
		By yearLocator = By.cssSelector("select#year>option");

		WebDriver driver = new ChromeDriver();
		
		logger.info("Deleteing all cookies");
		driver.manage().deleteAllCookies();
		
		logger.info("maximizing the window");
		driver.manage().window().maximize();
		
		logger.info("navigating to Facebook.com");
		driver.get("https://www.facebook.com");
		
		logger.info("Clicking on the create new Account");
		driver.findElement(createNewAccount).click();
		
		logger.info("implicitly wait for Sign Up page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger.info("Waiting for visibility of the elememts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='day']"))));
		
		logger.info("getting List of all days available from Drop Down using Select");
		List<WebElement> dayList= driver.findElements(dayLocator);
		
		for(WebElement elem : dayList) {
			
			System.out.println(elem.getText());
			if(elem.getText().equals("27")) {
				
				elem.click();
			}
		}
		
		logger.info("Selecting the dates using Select class");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		select.selectByVisibleText("5");
		
		logger.info("got all the dates now closing the browser");
		driver.quit();
	}

}
