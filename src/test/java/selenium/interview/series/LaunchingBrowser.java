package selenium.interview.series;

import org.testng.annotations.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchingBrowser {

	static WebDriver driver = new ChromeDriver();
	static String url = "https://amazon.com";
	static List<WebElement> al = new ArrayList<>();
	static List<String> urlList = new ArrayList<String>();
	static int count = 0;

	@Test(priority = 1)
	public static void launchBrowser() {

		// driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.in");
		String title = driver.getTitle();
		System.out.println("Title of the page = " + title);

	}

	@Test(priority = 2, dependsOnMethods = { "launchBrowser" })
	public static void getAllLinks(){

		al = driver.findElements(By.tagName("a"));
		for (WebElement elem : al) {

			String urlLink = elem.getAttribute("href");
			System.out.println(urlLink);
		
			urlList.add(urlLink);
			
		}

		//urlList.parallelStream().forEach(e->methodName(e));
		
		for (String host : urlList) {
			try {
				URL url = new URL(host);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setConnectTimeout(5000);
				connection.connect();

				if (connection.getResponseCode() == 200) {

					System.out.println("----Perfect Link----" + host);
					count++;
				}
			
			}
			catch (Exception e) {
				
			}
			}	
			System.out.println("Count === " +count);
			
	}

	@AfterTest
	public static void closeBrowser() {

		driver.quit();
	}
}
