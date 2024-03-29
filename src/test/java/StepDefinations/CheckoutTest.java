package StepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutTest {
	@When("User searches {string} and clicks on buynow")
	public void user_searches_and_clicks_on_buynow(String productname) throws InterruptedException {
		
		
		Base.driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);
		Base.driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) Base.driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		String productText ="OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)";
		
		
		//String parent=driver.getWindowHandle();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(6));
		wait.until(ExpectedConditions.elementToBeClickable(Base.driver.findElement(By.linkText(productText))));
		Base.driver.findElement(By.linkText(productText)).click();
		Thread.sleep(3000);
		Set<String>s=Base.driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();
		String parent=I1.next();
		String child_window=I1.next();
		
		
		
		System.out.println(parent);
		System.out.println(child_window);
		Base.driver.switchTo().window(child_window);
		JavascriptExecutor js1 = (JavascriptExecutor) Base.driver;
		js1.executeScript("window.scrollBy(0,2000)", "");
		Base.driver.findElement(By.id("buy-now-button")).click();
	}
	@Then("Check if app is navigating to checkout page")
	public void check_if_app_is_navigating_to_checkout_page() {
		String buyCheck = Base.driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[3]/h1")).getText();
		Assert.assertEquals(buyCheck, "Checkout");
	}

}
