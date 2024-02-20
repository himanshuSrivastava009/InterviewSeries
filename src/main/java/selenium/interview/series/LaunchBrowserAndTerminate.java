package selenium.interview.series;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.SessionId;

public class LaunchBrowserAndTerminate {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://amazon.in");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		try {
			Thread.sleep(300);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

		SessionId session = ((ChromeDriver)driver).getSessionId();
		System.out.println("curent session id = " +session);
	
		//Actions action = new Actions(driver);
		//action.keyDown(Keys.COMMAND).sendKeys("t").build().perform();
		//action.keyDown(Keys.COMMAND).sendKeys("t").keyUp(Keys.COMMAND).build().perform();
		//System.out.println("closing the broswer");
		//driver.close();
		driver = new ChromeDriver();
		SessionId session1 = ((ChromeDriver)driver).getSessionId();
		System.out.println("curent session id = " +session1);
		driver.get("https://facebook.com");
		driver.navigate().to("https://filpkart.com");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		try {
			Thread.sleep(300);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
