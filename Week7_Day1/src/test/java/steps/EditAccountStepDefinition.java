package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EditAccountStepDefinition extends BaseClass{
	@And("Click on Accounts button3")
	public void click_on_accounts_button3() {
	    driver.findElement(By.linkText("Accounts")).click();
	}
	@And("Click on the find accounts button2")
	public void click_on_the_find_accounts_button2() {
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	@And("enter Account Name as (.*)$")
	public void enter_the_account_name_as_deva_raja(String devaraja) {
		driver.findElement(By.xpath("(//*[@type='text'])[30]")).sendKeys(devaraja);
	}
	@And("Click on the Find Accounts button1")
	public void click_on_the_find_accounts_button1() {
	    driver.findElement(By.xpath("(//*[text()='Find Accounts'])[3]")).click();
	}
	@And("Click on Deva Raja account name")
	public void click_on_deva_raja_account_name() {
	    driver.findElement(By.linkText("Deva Raja")).click();
	}
	@And("Click on the Edit button")
	public void click_on_the_edit_button() {
	    driver.findElement(By.linkText("Edit")).click();
	}
	@And("Enter the Account name as {string}")
	public void enter_the_account_name_as(String devarajareegan) {
	    WebElement editName = driver.findElement(By.id("accountName"));
	    editName.clear();
	    editName.sendKeys(devarajareegan);
	}
	@When("Click on the Save button")
	public void click_on_the_save_button() {
	    driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	    System.out.println("Account Name Changed");
	}
}
