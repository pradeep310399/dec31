package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountTestng extends BaseClass {
	@Test
	public void runCreateAccount() throws InterruptedException {
		
		 //click the new button
		 driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
		 //enter the account name
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("(//label[@class='slds-form-element__label slds-no-flex']/following::input)[1]")).sendKeys("Pradeepkumar N");
		 //select ownership 
		 WebElement owner = driver.findElement(By.xpath("(//label[text()='Ownership']/following::input)[1]"));
		 driver.executeScript("arguments[0].click();", owner);
		 WebElement pub = driver.findElement(By.xpath("//span[@title='Public']"));
		 driver.executeScript("arguments[0].click();", pub);
		 //click the save button
		 WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		 driver.executeScript("arguments[0].click();", save);
		 //verify the account name
		 String text = driver.findElement(By.xpath("//span[@class='custom-truncate uiOutputText']")).getText();
		 System.out.println(text);
		 if(text.contains("Pradeepkumar N")) {
			 System.out.println("verified");
		 }else {
			 System.out.println("other");
		 }
		 
		 
	}
	}


