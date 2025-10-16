package week5.day1_Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail_Webtable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Enter "MAS" as the "From" station & Enter "MDU" as the "To" station
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS");
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");
		
//		Uncheck the "Sort on Date" checkbox.
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(5000);
		
//		Retrieve the train names from the web table.
		List<WebElement> trainElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		
		System.out.println("The List of Train Names that goes from MAS to MDU");
		List<String> trainNames = new ArrayList<>();
		for(WebElement names : trainElements) {
			String trainNameText = names.getText();
			System.out.println(trainNameText);
			trainNames.add(trainNameText);
		}
		
		Set<String> dupl = new HashSet<>(trainNames);
		if (trainNames.size() != dupl.size()) {
			System.out.println("Duplicates found");
		}
		else {
			System.out.println("No Duplicates found");
		}
		
		driver.quit();
		}
		
		
		
	}
