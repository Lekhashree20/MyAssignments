package assignments.week4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHTML2 {

	public static void main(String[] args) {

		// Set up the browser and its driver

		WebDriverManager.chromedriver().setup();

		// ChromeOption class to handle the browser notifications

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--disable-notifications");

		// Open the chrome browser

		ChromeDriver driver = new ChromeDriver(ch);

		// Launch the URL

		driver.get("https://html.com/tags/table/");

		// Maximize the URL

		driver.manage().window().maximize();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Number of Rows

		List<WebElement> list1 = driver.findElements(By.xpath("//table/caption/following-sibling::tbody/tr[1]/td"));

		System.out.println("Market share library :");

		for (WebElement webElement : list1) {

			String libraryPrecentage = webElement.getText();
			System.out.println(libraryPrecentage);

		}

		List<WebElement> list2 = driver.findElements(By.xpath("//table/caption/following-sibling::tbody/tr[2]/td"));

		System.out.println("Absolute Usage library :");

		for (WebElement webElement : list2) {

			String libraryPrecentage = webElement.getText();
			System.out.println(libraryPrecentage);

		}

	}

}
