package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {

		// Set up browser and driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(ch);

		// Maximize the window
		driver.manage().window().maximize();

		// Hit the URL
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement eleFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));

		// Switch to First frame

		driver.switchTo().frame(eleFrame);

		System.out.println("Switched to frame");

		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Not a Friendly Topic");

		WebElement eleFrame1 = driver.findElement(By.xpath("//iframe[@id='frame3']"));

		// Switch to second frame

		driver.switchTo().frame(eleFrame1);

		driver.findElement(By.xpath("//input[@id='a']")).click();

		driver.switchTo().defaultContent();

		WebElement eleFrame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));

		// Switch to third frame

		driver.switchTo().frame(eleFrame2);

		WebElement eleDropdown = driver.findElement(By.xpath("//select[@id='animals']"));

		Select dd = new Select(eleDropdown);

		dd.selectByIndex(1);

		driver.close();

	}

}
