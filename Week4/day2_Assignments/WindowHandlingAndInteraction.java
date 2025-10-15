package week4.day2_Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteraction {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
//		Login to the Website using the Credentials
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
//		click on contacts button and merge contact button
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
//		Switch into the New Window and select the first contact
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> newWindow = driver.getWindowHandles();
		String windowHand = driver.getWindowHandle();
		for(String window:newWindow) {
			if (!window.equals(windowHand)) {
				driver.switchTo().window(window);
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
//		Switch back to parent window
		driver.switchTo().window(windowHand);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a/img")).click();	
		
		Set<String> newWindow1 = driver.getWindowHandles();
		for(String window:newWindow1) {
			if (!window.equals(newWindow1)) {
				driver.switchTo().window(window);
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
//		Switch back to parent window
		driver.switchTo().window(windowHand);
//		Click on the Merge Button and Click OK on the Alert
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
//		Get The Title of the Page
		@Nullable
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " +pageTitle);
		driver.quit();

	}

}
