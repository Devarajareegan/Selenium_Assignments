package week4.day2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Interactions {

	public static void main(String[] args) throws InterruptedException {
//		Launch the Browser, load the URL and Maximize the Window
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@role='button'])[1]")).click();
//		Accept
		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//		Confirm and Print the Result's Text
		driver.switchTo().alert().accept();
		String result = driver.findElement(By.id("result")).getText();
		if (result.equalsIgnoreCase("User Clicked : OK")) {
			System.out.println(" The Result is " +result);
		}
		driver.findElement(By.xpath("//h5[contains(text(),'Sweet Alert')]/following::span[1]")).click();
//		Dismiss
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
//		Prompt Alert
		driver.switchTo().alert().sendKeys("Alerted Successfully");
		driver.switchTo().alert().accept();
		
		Thread.sleep(2500);
		
		driver.quit();

	}

}
