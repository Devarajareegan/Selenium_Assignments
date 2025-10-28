package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	@BeforeMethod
    public void preConditions() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void postConditions() throws InterruptedException {
    	Thread.sleep(3000);
        driver.quit();
    }
}
