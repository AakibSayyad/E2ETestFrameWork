package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addressAddTest {
	@When("User clicks on your addresses in account settings")
	public void user_clicks_on_your_addresses_in_account_settings() {
		Base.driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Base.driver.findElement(By.partialLinkText("Your Addresses")).click();
		Base.driver.findElement(By.id("ya-myab-plus-address-icon")).click();
		
	
	}
	@When("then to adds new address")
	public void then_to_adds_new_address() throws InterruptedException {
		Base.driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Mock Address");
		Base.driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("9999999999");
		Base.driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("500081");
		Thread.sleep(3000);
		Base.driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("12D");
		Base.driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("madhapur");
		Base.driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("Mindspace");
		JavascriptExecutor js1 = (JavascriptExecutor) 	Base.driver;
		js1.executeScript("window.scrollBy(0,200)", "");
		//driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Hyderabad");
		//Select dropdown = new Select(driver.findElement(By.className("a-button-text a-declarative")));
		//dropdown.selectByVisibleText("TELANGANA");
		Base.driver.findElement(By.id("address-ui-widgets-form-submit-button")).click();
	}
	@Then("Check if address is sucessfully saved")
	public void check_if_address_is_sucessfully_saved() {
		//driver.findElement(By.xpath("//input[@id='address-ui-widgets-form-submit-button']")).click();
		String actualText = Base.driver.findElement(By.className("a-alert-heading")).getText();
		Assert.assertEquals(actualText, "Address saved");
	}
}
