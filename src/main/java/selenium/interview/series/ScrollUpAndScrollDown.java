package selenium.interview.series;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown {

	protected static final Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement Element = driver.findElement(By.linkText("Try BrowserStack for Free"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		js.executeScript("window.scrollBy(0,-350)", "");

	}

}
