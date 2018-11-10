package sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class cucumber {
static WebDriver driver;
	@Given("^The user is in login page$")
	public void the_user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium1\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("^Enter valid credentials$")
	public void enter_valid_credentials() {
	 driver.findElement(By.xpath("//input[@name='uid']")) .sendKeys("mngr161874");  
	 driver.findElement(By.xpath("//input[@name='password']")) .sendKeys("EhedUve");  
	 driver.findElement(By.xpath("//input[@name='btnLogin']")) .click();;  
	}

	@Then("^login manager page$")
	public void login_manager_page() {
	   Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
	}

	
}
