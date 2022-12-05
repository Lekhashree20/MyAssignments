package assignments.week4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableChittorgarh {

	public static void main(String[] args) {

		// Set up the browser and its driver

		WebDriverManager.chromedriver().setup();

		// ChromeOption class to handle the browser notifications

		ChromeOptions ch = new ChromeOptions();

		ch.addArguments("--disable-notifications");

		// Open the chrome browser

		ChromeDriver driver = new ChromeDriver(ch);

		// Launch the URL

		driver.get("https://www.chittorgarh.com/");

		// Maximize the URL

		driver.manage().window().maximize();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click STock market and Click on NSE bulk deals

		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();

		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();

		// Get all the Security names

		List<WebElement> webElements = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody/tr/td[3]"));

		int listSize = webElements.size();
		System.out.println("List size " + listSize);

		// Create a set and add all the elements

		Set<String> securityNames = new LinkedHashSet<String>();

		for (WebElement string : webElements) {

			securityNames.add(string.getText());

		}
		System.out.println("Security names " + securityNames);

		int setSize = securityNames.size();
		
		System.out.println("Set size "+setSize);

		if (listSize != setSize)

			System.out.println("Duplicates present");

		else
			System.out.println("No Duplicates");
		
		driver.close();

	}

}
