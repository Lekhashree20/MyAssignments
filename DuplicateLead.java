package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/");

		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();

		WebElement eleCrmLink = driver.findElement(By.linkText("CRM/SFA"));
		eleCrmLink.click();

		WebElement eleLeads = driver.findElement(By.linkText("Leads"));
		eleLeads.click();

		WebElement eleCreateLead = driver.findElement(By.linkText("Create Lead"));
		eleCreateLead.click();

		WebElement eleCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		eleCompanyName.sendKeys("Cognizant");

		WebElement eleForeName = driver.findElement(By.id("createLeadForm_firstName"));
		eleForeName.sendKeys("Lekhashree");

		WebElement eleLastName = driver.findElement(By.id("createLeadForm_lastName"));
		eleLastName.sendKeys("Sathyanarayanan");
		
		WebElement eleFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		eleFirstNameLocal.sendKeys("Lekha");
		
		WebElement eleDepName = driver.findElement(By.id("createLeadForm_departmentName"));
		eleDepName.sendKeys("Testing");
		
		WebElement eleDescription = driver.findElement(By.id("createLeadForm_description"));
		eleDescription.sendKeys("Creating Lead");
		
		WebElement eleEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		eleEmail.sendKeys("lekashree20@gmail.com");
		
		WebElement eleStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleStateProvince);
		dd.selectByVisibleText("Colorado");
		
		
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd1 = new Select(eleSource);
		dd1.selectByValue("LEAD_EMPLOYEE");
		

		WebElement eleSubmitButton = driver.findElement(By.name("submitButton"));
		eleSubmitButton.click();
		
		Thread.sleep(3000);
		
		String titleViewLead = driver.getTitle();
		System.out.println(titleViewLead);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updating the Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		String titleEditLead = driver.getTitle();
		System.out.println(titleEditLead);
		
		

		Thread.sleep(2000);
		driver.close();
		
	}

}
