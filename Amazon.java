package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Set up browser and driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(ch);

		// Maximize the window
		driver.manage().window().maximize();

		// Hit the URL
		driver.get("https://www.amazon.in/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter one plus 9 pro in the search box and click enter
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);

		// Get the Price and Print it
		String elePrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();

		String newPrice = elePrice.replace(",", "");

		System.out.println(newPrice);

		// Print the number of customer Ratings
		String eleCustRating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();

		System.out.println(eleCustRating);

		// Click on the First link text
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windowHandle = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windowHandle.get(1));

		System.out.println("Switched to new window");

		// Take screenshot of the webpage
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/mobilePrice.png");
		FileUtils.copyFile(source, dest);

		Thread.sleep(3000);

		// Click Add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		Thread.sleep(3000);

		// Get the cart sub total
		String elePrice2 = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();

		String newPrice2 = elePrice2.replace(",", "").replace("₹", "").replace(".", "");

		System.out.println(newPrice2);

		if (newPrice.equals(newPrice2))

			System.out.println("Correct");

		else
			System.out.println("Incorrect");

	}

}
