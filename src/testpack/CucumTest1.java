package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumTest1 {
	static WebDriver driver;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Syed Satham\\eclipse-workspace\\Syed\\selenium\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("^I complete action$")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement txtU = driver.findElement(By.id("email"));
		txtU.sendKeys("Syed");
		WebElement txtP = driver.findElement(By.id("pass"));
		txtP.sendKeys("s1y9e9d2");
	}
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	}
}
