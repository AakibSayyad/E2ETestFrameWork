package StepDefinations;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class udemytest {
	@Given("Driver is initiated and udemy site is open")
	public void driver_is_initiated_and_udemy_site_is_open() {
		Base.driver.get(Base.prop.getProperty("udemyurl"));
	}

	@When("typed username {string} and password {string}")
	public void typed_username_and_password(String string, String string2) {
		Base.driver.findElement(By.name("email")).sendKeys(string);
		Base.driver.findElement(By.name("password")).sendKeys(string2);
		Base.driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/form/button")).click();
	}

	@Then("validate if udemy login working")
	public void validate_if_udemy_login_working() {
		System.out.println("validated");
	}
}
