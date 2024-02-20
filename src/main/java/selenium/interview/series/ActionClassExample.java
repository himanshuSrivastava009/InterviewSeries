package selenium.interview.series;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	protected static final Logger logger = LogManager.getLogger();
	static List<WebElement> mySearchResultList;

	public static void main(String[] args) {

		By googleSearch = By.name("q");
		By searchResult = By.xpath("//ul[@role='listbox']/li");
		By searchResultDisplay = By.xpath("//div[@id='rso']/div");

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(googleSearch)).sendKeys("selenium").build().perform();

		List<WebElement> searchAutoHelper = driver.findElements(searchResult);

		for (WebElement elem : searchAutoHelper) {
			System.out.println(elem.getText());
			if (elem.getText().equalsIgnoreCase("selenium interview questions")) {

				action.click(elem).build().perform();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Current URL = " + driver.getCurrentUrl());

		logger.info("#######################################");
		logger.info(" gettting the all values by Xpath");
		mySearchResultList = driver.findElements(searchResultDisplay);
		for (WebElement elem : mySearchResultList) {

			System.out.println(elem.getText());
		}
		action.moveToElement(mySearchResultList.get(0)).click().build().perform();

		String currentPageUrl = driver.getCurrentUrl();
		System.out.println(currentPageUrl);

		driver.navigate().back();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		logger.info("#######################################");
		logger.info("#######################################");
		logger.info(" gettting the all values by tag Name A");
		mySearchResultList = driver.findElements(By.tagName("a"));
		for (WebElement elem : mySearchResultList) {

			System.out.println(elem.getText());
		}
		for (WebElement elem : mySearchResultList) {

			if (elem.getText().contains("www.guru99.com")) {
				action.moveToElement(elem).click().build().perform();
				break;
			}
			break;
		}

		String currentPageUrl1 = driver.getCurrentUrl();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(currentPageUrl1);

		driver.quit();
	}

}
