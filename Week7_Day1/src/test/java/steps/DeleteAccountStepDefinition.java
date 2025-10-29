package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccountStepDefinition extends BaseClass{
	@Given("Click on Accounts button")
	public void click_on_accounts_button() {
	    driver.findElement(By.linkText("Accounts")).click();
	}
	@Given("Click on the find accounts button")
	public void click_on_the_find_accounts_button() {
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	@And("enter the Account Name as (.*)$")
	public void enter_the_account_name_as_deva_raja(String devarajareegan) {
		driver.findElement(By.xpath("(//*[@type='text'])[30]")).sendKeys(devarajareegan);
	}
	@And("Click on the Find Accounts button")
	public void click_on_the_find_accounts_button1() {
	    driver.findElement(By.xpath("(//*[text()='Find Accounts'])[3]")).click();
	}
	@And("Click on the Deva Raja account name")
	public void click_on_the_deva_raja_account_name() {
	    driver.findElement(By.linkText("Deva Raja Reegan S")).click();
	}
	@When("Click on Deactivate account button")
	public void click_on_deactivate_account_button() {
		driver.findElement(By.linkText("Deactivate Account")).click();
	}
	@Then("The Account name should be deleted")
	public void the_account_name_should_be_deleted() {
		driver.switchTo().alert().accept();
	    System.out.println("The Account has been Terminated");
	}
}
