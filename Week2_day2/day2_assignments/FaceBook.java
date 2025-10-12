package week2.day2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Deva Raja Reegan");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		WebElement day = driver.findElement(By.id("day"));
		
		Select days = new Select(day);
		days.selectByValue("23");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("Feb");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("DevaRaja@147963");
		
		Thread.sleep(5000);
		driver.quit();	
		
		
		
	}
}
