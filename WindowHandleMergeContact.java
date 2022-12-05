package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleMergeContact {

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
		driver.get("http://leaftaps.com/opentaps/");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter the username
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");

		// ENter the password
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		// Click on submit button
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();

		// Click on CRM/SFA link
		WebElement eleCrmLink = driver.findElement(By.linkText("CRM/SFA"));
		eleCrmLink.click();

		// click on contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Click on Merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// Click on the From Widget
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a/img")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windowHandle = new ArrayList<String>(windowHandles);

		System.out.println(windowHandle);

		driver.switchTo().window(windowHandle.get(1));

		// Click on the First Result
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		driver.switchTo().window(windowHandle.get(0));

		// Click on the To Widget
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a/img")).click();

		windowHandles = driver.getWindowHandles();

		windowHandle = new ArrayList<String>(windowHandles);

		System.out.println(windowHandle);

		driver.switchTo().window(windowHandle.get(1));

		// Click on the second result
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();

		driver.switchTo().window(windowHandle.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		alert.accept();

		

	}

}
