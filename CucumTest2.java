package cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumTest2 {
	 public static WebDriver driver;
	@Given("^The user is in login page$")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed Satham\\eclipse-workspace\\Syed\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("^The user enter valid login credetials$")
	public void the_user_enter_valid_login_credetials() {
		WebElement txtU = driver.findElement(By.xpath("//input[@name='uid']"));
		txtU.sendKeys("mngr161879");
		WebElement txtP = driver.findElement(By.xpath("//input[@name='password']"));
		txtP.sendKeys("UZajeqy");
		WebElement btNL = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btNL.click();
	}

	@Then("^The user move to his profile home page$")
	public void the_user_move_to_his_profile_home_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
	}
}
