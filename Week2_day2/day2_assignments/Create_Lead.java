package week2.day2_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Create_Lead {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new  ChromeOptions();
		opt.addArguments("guest");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deva Raja Reegan");
		driver.findElement(By.xpath("(//input[@type='text'])[27]")).sendKeys("S");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[17]")).sendKeys("0123456789");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Create Lead");
		driver.findElement(By.className("smallSubmit")).click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "View Lead | opentaps CRM";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title is Displayed Correctly");
		}
		else {
			System.out.println("Title is not Displayed Correctly");
		}
		Thread.sleep(5000);
		driver.quit();
		
	}
}
