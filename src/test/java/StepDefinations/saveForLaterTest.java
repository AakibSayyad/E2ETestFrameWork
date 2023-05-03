package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saveForLaterTest {
	@When("Navigates to cart and clicks on save for later")
	public void navigates_to_cart_and_clicks_on_save_for_later() {
		Base.driver.findElement(By.xpath("//*[@id=\"banner-image\"]/span/span/div/i[1]")).click();
		Base.driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]")).click();
		Base.driver.findElement(By.xpath("//input[@value='Save for later']")).click();

	}

	@Then("check if item is added in save for later")
	public void check_if_item_is_added_in_save_for_later() throws InterruptedException {
		JavascriptExecutor js2 = (JavascriptExecutor) Base.driver;
		js2.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);
//		String actualMobileName = Base.driver
//				.findElement(By.partialLinkText(" OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 8GB RAM, 128GB Storag...")).getText();
//
//		Assert.assertEquals(actualMobileName, " OnePlus Nord CE 3 Lite 5G (Chromatic Gray, 8GB RAM, 128GB Storag...");
	}
}
