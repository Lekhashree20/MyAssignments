package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {

		// Set up browser and driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(ch);

		// Maximize the window
		driver.manage().window().maximize();

		// Hit the URL
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String originalHandle = driver.getWindowHandle();

		// Single Window

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windowHandle = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windowHandle.get(1));

		System.out.println(driver.getTitle());

		// Open Multiple window

		driver.switchTo().window(windowHandle.get(0));

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		// Get window handles

		Set<String> windowHandles2 = driver.getWindowHandles();

		List<String> windowHandle2 = new ArrayList<String>(windowHandles2);

		int size = windowHandle2.size();

		System.out.println("Total number of window opened is : " + size);

		// close all the handles

		for (String window : windowHandle2) {

			if (!window.equals(originalHandle)) {
				driver.switchTo().window(window);
				driver.close();

			}

		}

		driver.switchTo().window(originalHandle);
		
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		driver.quit();
		
	}

}
