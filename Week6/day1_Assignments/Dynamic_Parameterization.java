package week6.day1_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dynamic_Parameterization extends Base_Class {
	@Test
	@Parameters({"username","password","accountName"})
	public void createNewAccount(String username, String password, String accountName) {
//		Enter the User Credentials
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		driver.findElement(By.className("smallSubmit")).click();
	}
	
}
