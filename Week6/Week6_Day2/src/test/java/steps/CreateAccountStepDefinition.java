package steps;

import java.time.Duration;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends BaseClass{
	@Given("Enter the userName as {string}")
	public void enter_the_user_name_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the passWord as {string}")
	public void enter_the_pass_word_as(String password) {
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
	}
	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("It should navigate to next page")
	public void it_should_navigate_to_next_page() {
	    System.out.println("Login in to the CRMSFA Page");
	}
	@When("Click on Crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("Click on Create Account")
	public void click_on_create_account() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@When("Enter the new accountname as(.*)$")
	public void enter_the_new_accountname_as_newacountname(String newaccountname) {
		driver.findElement(By.id("accountName")).sendKeys(newaccountname);
	}
	@When("Click on the create Account button")
	public void click_on_the_create_account_button() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("It should create a new account")
	public void it_should_create_a_new_account() {
	    System.out.println("New Account has been Created");
	}
}
