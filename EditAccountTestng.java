package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAccountTestng extends BaseClass {
	@Test
	public void runEditAccount() throws InterruptedException {
		
		 //search bar
		 driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Pradeepkumar N",Keys.ENTER);
		 //click the dropdown
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//span[text()='Show Actions']/parent::span)[1]")).click();
		 Thread.sleep(5000);
		 //click the edit option
		 driver.findElement(By.xpath("//div[text()='Edit']/parent::a")).click();
		 //select type as technology partner
		 Thread.sleep(5000);
		 WebElement type = driver.findElement(By.xpath("(//label[text()='Type'])"));
		 driver.executeScript("arguments[0].click();", type);
		 Thread.sleep(5000);
		 WebElement tech = driver.findElement(By.xpath("(//span[@title='Technology Partner'])"));
		 driver.executeScript("arguments[0].click();", tech);
		 //select the industry
		 Thread.sleep(5000);
		 WebElement indus = driver.findElement(By.xpath("(//label[text()='Industry'])"));
		 driver.executeScript("arguments[0].click();", indus);
		 Thread.sleep(5000);
		 WebElement health = driver.findElement(By.xpath("//span[@title='Healthcare']"));
		 driver.executeScript("arguments[0].click();", health);
		 //enter the billing address
		 driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys("NUMBER:97,VIVEKANANDHAR STREET,DUBAI CROSS STREET,DUBAI MAIN ROAD");
		 //ENTER THE SHIPPING ADDRESS
		 driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("NUMBER:361,KPK STREEET,VALAPANDHAL,RANIPET DISTRICT,632318");
		 //select the priority as low
		 WebElement prior = driver.findElement(By.xpath("(//label[text()='Customer Priority'])"));
		 driver.executeScript("arguments[0].click();", prior);
		 WebElement low = driver.findElement(By.xpath("(//span[@title='Low'])"));
		 driver.executeScript("arguments[0].click();", low);
		 //select SLA
		 WebElement SLA = driver.findElement(By.xpath("(//label[text()='SLA'])"));
		 driver.executeScript("arguments[0].click();", SLA);
		 WebElement silver = driver.findElement(By.xpath("(//span[text()='Silver'])"));
		 driver.executeScript("arguments[0].click();", silver);
		 //select Active
		 WebElement Active = driver.findElement(By.xpath("(//label[text()='Active'])"));
		 driver.executeScript("arguments[0].click();", Active);
		 WebElement findElement = driver.findElement(By.xpath("(//span[text()='No'])"));
		 driver.executeScript("arguments[0].click();", findElement);
		 //enter unique number in phone field
		 WebElement cell = driver.findElement(By.xpath("(//label[text()='Phone']/following::input)[1]"));
		/* driver.executeScript("arguments[0].click();", cell); */
		 cell.sendKeys("9442455958");
		 //select upshell opportunity
		 Thread.sleep(2000);
		 WebElement upshell = driver.findElement(By.xpath("(//label[text()='Upsell Opportunity'])"));
		 driver.executeScript("arguments[0].click();", upshell);
		 WebElement findElement2 = driver.findElement(By.xpath("(//span[text()='No'])[1]"));
		 driver.executeScript("arguments[0].click();", findElement2);
		 //click the save
		 WebElement save = driver.findElement(By.xpath("(//button[@name='SaveEdit'])"));
		 driver.executeScript("arguments[0].click();", save);
		 //verify the phone number
		 String text = driver.findElement(By.xpath("(//span[@class='forceOutputPhone slds-truncate'])[1]")).getText();
		 System.out.println(text);

		 
	}
	}


