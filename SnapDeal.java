package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws IOException {

		// Set up browser and driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(ch);

		// Maximize the window
		driver.manage().window().maximize();

		// Hit the URL
		driver.get("https://www.snapdeal.com/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Navigate to Men's fashion-->Sports shoes
		WebElement eleHoverMenFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));

		Actions builder = new Actions(driver);
		builder.moveToElement(eleHoverMenFashion).perform();

		driver.findElement(By.xpath("//span[text()=\"Sports Shoes\"]")).click();

		// Count of Sports shoes

		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();

		String newText = text.replaceAll("[^0-9]", "").trim();

		System.out.println("Count of Sports shoes : " + newText);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// Select sort by as Price low to High

		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();

		driver.findElement(By.xpath("//li[@class='search-li']")).click();

		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<String> priceList = new ArrayList<String>();

		System.out.println("Shoes by Price Low to High");

		for (WebElement webElement : findElements) {

			// priceList.add(webElement.getText());

			String text2 = webElement.getText();

			String trim = text2.replaceAll("[^0-9]", "").trim();

			priceList.add(trim);
		}

		System.out.println("Sorted Price List : " + priceList);

		// Select the price range as 900 to 1200

		WebElement eleFromPrice = driver.findElement(By.xpath("//input[@name='fromVal']"));

		eleFromPrice.clear();

		eleFromPrice.sendKeys("900");

		WebElement eleToPrice = driver.findElement(By.xpath("//input[@name='toVal']"));

		eleToPrice.clear();

		eleToPrice.sendKeys("1200");

		// Click on the Go button

		driver.findElement(By.xpath("//div[@class ='price-go-arrow btn btn-line btn-theme-secondary']")).click();

		// Verify the applied filters

		WebElement eleFilter = driver.findElement(By.xpath("//a[@class='clear-filter-pill']"));

		if (eleFilter.getText().contains("900"))

			System.out.println("Applied Filters are Matching and verfied");

		else

			System.out.println("Applied Filters are not Matching");

		// Mouse hover on first resulting element and click on the Quick view

		WebElement eleFirstShirt = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));

		WebElement eleQuickView = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));

		builder.moveToElement(eleFirstShirt).pause(Duration.ofSeconds(1)).click(eleQuickView).perform();

		// Print the cost and Discount percentage

		String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();

		String price = text2.replaceAll("[^0-9]", "");

		String discount= driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
		System.out.println("Cost of the filtered shoe is "+price);
		
		System.out.println("Discount of the filtered shoe is "+discount);
		
		//snapchat of the shoe
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snaps/shoes.png");
		
		FileUtils.copyFile(source, dest);
		
		driver.close();
		
		driver.quit();
		

		

	}

}
