package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonSignInTest {
	@Given("The driver is initiated and amazon site is loaded")
	public void the_driver_is_initiated_and_amazon_site_is_loaded() {
		Base.driver.get(Base.prop.getProperty("url"));
		Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Base.driver.manage().window().maximize();
	}
	@When("User Enters credentials number {string} and password {string}")
	public void user_enters_credentials_number_and_password(String number, String password) throws InterruptedException {
		Base.driver.findElement(By.id("nav-link-accountList")).click();		
		Base.driver.findElement(By.id("ap_email")).sendKeys(number);
		Base.driver.findElement(By.id("continue")).click();
		Base.driver.findElement(By.id("ap_password")).sendKeys(password);
		Thread.sleep(2000);
		Base.driver.findElement(By.id("signInSubmit")).click();
	}
	@Then("Validate if sigin is sucessfull.")
	public void validate_if_sigin_is_sucessfull() {
		String accName = Base.driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
		Assert.assertEquals(accName, "Hello, Vijay");
	}
}
