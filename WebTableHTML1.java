package assignments.week4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHTML1 {

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

		List<WebElement> eleRows = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));

		int rowsSize = eleRows.size();

		System.out.println("Rows size :" + rowsSize);

		// Number of Columns

		List<WebElement> eleColumns = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));

		int columSize = eleColumns.size();

		System.out.println("Columns size :" + columSize);
		
		driver.close();

	}

}
