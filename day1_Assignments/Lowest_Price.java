package week4.day1_Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lowest_Price {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		WebDriver driver = new ChromeDriver(options);
//		Launch the URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
//		Search phones in the search field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		get the List of WebElement of Prices and Sort it out in Ascending order		
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
//		Create a list to store the Prices
		List<Integer> prices = new ArrayList<>();
		
		for(WebElement priceElement:priceElements) {
			String priceElementText = priceElement.getText().replace(",", "");
			try {
				prices.add(Integer.parseInt(priceElementText));
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		Collections.sort(prices);
		Integer lowestPrice = prices.get(0);
		Integer lowestPrice1 = prices.get(1);
		System.out.println("The Lowest Price of the Mobile Equipment is Rs."+ lowestPrice);
		System.out.println(" The Lowest Price of the Mobile is Rs."+ lowestPrice1);
		
		driver.quit();
		
		
		
	}

}
