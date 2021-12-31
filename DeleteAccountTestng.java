package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAccountTestng extends BaseClass{
	@Test
	public void runDeleteAccount() throws InterruptedException {
		
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
