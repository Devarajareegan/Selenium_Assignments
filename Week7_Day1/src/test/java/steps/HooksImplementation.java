package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClass{
	@Before
    public void preConditions() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        driver = new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
    }

    @After
    public void postConditions() throws InterruptedException {
    	Thread.sleep(3000);
        driver.quit();
    }
}
