package week3.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionsListAjio {

	public static void main(String[] args) {

		// Set up the browser and its driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(ch);

		// MAximize the window
		driver.manage().window().maximize();

		// Hit the URL
		driver.get("https://www.ajio.com/");

		// IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Search box
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		
		//Check box Men
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		
		//check box - Fashion bags
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		
		//Get the count of the bags
		String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
		
		System.out.println("Total number of items displayed : "+items);
		
		//Brand List
		
		System.out.println("List of bag brand names : ");
		
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		
		for (WebElement brandname : brandNames) {
			
			String bagBrandName = brandname.getText();
			
			System.out.println(bagBrandName);
			
		}
		
		System.out.println("List of Bag names:");
		
		List<WebElement> Names = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for (WebElement Name : Names) {
			
			String bagName = Name.getText();
			
			System.out.println(bagName);
		}
		

	}

}
