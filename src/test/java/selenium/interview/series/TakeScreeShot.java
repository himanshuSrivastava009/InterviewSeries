package selenium.interview.series;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;


public class TakeScreeShot {
	//WebDriver driver = new ChromeDriver();
	
	@Test
	public void launchBrowserAndTakeScreenshot() throws IOException {
		
		
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView", driver.findElement(null));
//		driver.get("");
//		
//		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//Files.move(screenshotAs, screenshotAs);
		System.out.println(System.getProperty("user.dir"));
		
		int[] arr = new int[] {1,2,3,4,5};
		//Arrays.stream(arr).mapToObj(Integer::valueOf).forEach(System.out::println);
		String[] str = new String[] {"Himanshu","swati","saurabh","preeti"};
		long count = Arrays.stream(str).map(String::toLowerCase).filter(k->k.contains("i")).count();
		System.out.println(count);
		
		
	}
}
