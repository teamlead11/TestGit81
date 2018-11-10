package org.mav.CucumberPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucuSample {
	
	static WebDriver driver;
	
	@Given("^I want to launch the browser$")
	public void i_want_to_launch_the_browser() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\papunu\\Selenium\\SeleniumDay8\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V1/index.php");
		
	}

	@When("^I want to write the test case$")
	public void i_want_to_write_the_test_case() {
	    
		driver.findElement(By.name("uid")).sendKeys("mngr161875");
		
		driver.findElement(By.name("password")).sendKeys("EvAregy");
		
		driver.findElement(By.name("btnLogin")).click();
	   
		
	}

	@Then("^Check the validation$")
	public void check_the_validation() {
	    
	Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
		
	}

}
