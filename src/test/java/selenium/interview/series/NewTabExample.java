package selenium.interview.series;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Consumer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabExample {

	ArrayList<String> windowTitle = new ArrayList<>();
	@Test
	public void openNewTab() {
		
		final WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		Set<String> handles= driver.getWindowHandles();
		handles.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String k) {
				System.out.println(driver.switchTo().window(k).getTitle());
			}
		});
		handles.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String k) {
				windowTitle.add(driver.switchTo().window(k).getTitle());
			}
		});
		System.out.println(windowTitle);
		driver.quit();

		
	}
}
