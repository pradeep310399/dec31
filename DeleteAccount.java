package december31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//enter the url
		driver.get("https://login.salesforce.com/");
		//Enter the username and password
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		//click the login button
		driver.findElement(By.id("Login")).click();
		//click the toggle button
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//click the view all button
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//click the sales option
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and...']")).click();
		//click the accounts tab
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		 driver.executeScript("arguments[0].click();", accounts);
		 //search bar
		 driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Pradeepkumar N",Keys.ENTER);
		 //click the dropdown
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[text()='Show Actions']/parent::span)[1]")).click();
		 Thread.sleep(5000);
		 //click the delete option
		 WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']/parent::a"));
		 driver.executeScript("arguments[0].click();", delete);
		 WebElement del = driver.findElement(By.xpath("//span[text()='Delete']"));
		 driver.executeScript("arguments[0].click();", del);
		 //verify the account name
		 WebElement verify = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		 verify.sendKeys("Pradeepkumar N",Keys.ENTER);
		 
		 
		 

}
}
