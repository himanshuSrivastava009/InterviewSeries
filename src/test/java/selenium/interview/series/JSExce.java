package selenium.interview.series;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JSExce {

	static String url;
	static String title;
	static Set<String> handles;

	public static void main(String[] args) throws InterruptedException {
		/*
		 * WebDriver driver = new ChromeDriver(); JavascriptExecutor js =
		 * ((JavascriptExecutor) (driver));
		 * js.executeScript("arguments[0].scrollIntoView();", driver.findElement(null));
		 */

		ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
		tlDriver.set(new ChromeDriver());
		WebDriver driver = tlDriver.get();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");

		url = driver.getCurrentUrl();
		System.out.println("Current URL is = " + url);

		title = driver.getTitle();
		System.out.println("Current page title is " + title);
		
		String parentWindowhandle = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");

		url = driver.getCurrentUrl();
		System.out.println("Current URL is = " + url);

		title = driver.getTitle();
		System.out.println("Current page title is " + title);
		
		
		handles= driver.getWindowHandles();
		
		  for(String handle : handles) {
		  
		  title = driver.switchTo().window(handle).getTitle();
		  System.out.println("Switching Title is = " +title); Thread.sleep(5000);
		  
		  
		  }
		 
		
		
		handles.remove(driver.getWindowHandle());
		driver.close();
		
		
		driver.switchTo().window(handles.iterator().next());
		
		url = driver.getCurrentUrl();
		
		System.out.println("Now on page " +url);
		
		
		driver.close();
		//driver.quit();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");//invalid session ID
		url = driver.getCurrentUrl(); //No Such Session exception
		System.out.println("URL value after closing the All Tabl " +url);
		
		//Actions action = new Actions(driver);
		//driver.switchTo().alert();
		
		
	}
}
