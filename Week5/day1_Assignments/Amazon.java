package week5.day1_Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		Get the text of "Conditions of Use and Sale" and print it in the console.
		Actions act = new Actions(driver);
		
		WebElement element = driver.findElement(By.linkText("Conditions of Use & Sale"));
		act.scrollToElement(element).perform();
		System.out.println(element.getText());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		
		File path = new File("./Data/Amazonwebpage.png");
		
		FileUtils.copyFile(screenShot, path);
		Thread.sleep(2500);
		driver.quit();

	}

}
