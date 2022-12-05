package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

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
		driver.get("https://www.nykaa.com/");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Mouseover on Brands and Search L'Oreal Paris

		WebElement eleBrands = driver.findElement(By.xpath("//a[text()='brands']"));

		Actions builder = new Actions(driver);

		builder.moveToElement(eleBrands).perform();

		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");

		driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();

		System.out.println(driver.getTitle());

		// Click sort By and select customer top rated

		driver.findElement(By.xpath("//span[@class='sort-name']")).click();

		driver.findElement(By.xpath("//span[@class='title'][text()='customer top rated']")).click();

		// Click Category and click Hair->Click haircare->Shampoo

		driver.findElement(By.xpath("//span[text()='Category']")).click();

		driver.findElement(By.xpath("//span[text()='Hair']")).click();

		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();

		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

		// Click->Concern->Color Protection

		driver.findElement(By.xpath("//span[text()='Concern']")).click();

		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		// check whether the Filter is applied with Shampoo

		String text = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();

		if (text.contains("Shampoo"))

			System.out.println("Shampoo is selected as filter");

		// Click on L'Oreal Paris Colour Protect Shampoo

		driver.findElement(By.xpath("//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();

		// Switch to new window

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(handles.get(1));

		System.out.println(driver.getTitle());

		// GO to the new window and select size as 175ml

		WebElement eleQuantity = driver.findElement(By.xpath("//select[@title='SIZE'] "));

		Select dd = new Select(eleQuantity);

		dd.selectByIndex(0);

		// Print the MRP of the product

		String eleMrp = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();

		System.out.println(eleMrp);

		String newPrice = eleMrp.replace("₹", "");

		int price = Integer.parseInt(newPrice);

		System.out.println("MRP of the product is :" + price);

		// Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();

		// Go to Shopping Bag
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		WebElement findElement = driver.findElement(By.xpath("(//iframe)[1]"));
		
		driver.switchTo().frame(findElement);

		// Print the Grand Total amount
		String text2 = driver.findElement(By.xpath("//p[text()='You Pay']/following::p")).getText();

		String replace = text2.replace("₹", "");

		System.out.println("Grand Total is :" + replace);

		// Click proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();

		String text3 = driver.findElement(By.xpath("(//p[text()='Price Details']/following::p)[2]")).getText();

		String replace2 = text3.replace("₹", "");

		System.out.println(replace2);

		if (replace.equals(replace2))

			System.out.println("Matching");
		else

			System.out.println("Not Matching");

		driver.quit();

	}

}
