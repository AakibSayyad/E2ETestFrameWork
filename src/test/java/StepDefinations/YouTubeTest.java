package StepDefinations;


import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YouTubeTest {
	@Given("The driver is initiated and Youtube page has loaded")
	public void the_driver_is_initiated_and_youtube_page_has_loaded() {
		 System.out.println("POp");
	}
	@Then("validate if its working")
	public void validate_if_its_working() {
		 System.out.println("Validated");
	}

	@When("Typed in search box and clicked on button")
	public void typed_in_search_box_and_clicked_on_button() {
		Base.driver.get(Base.prop.getProperty("url"));
		Base.driver.manage().window().maximize();
		Base.driver.findElement(By.name("search_query")).sendKeys("Premier League goal of the week");
		Base.driver.findElement(By.id("search-icon-legacy")).click();
	}

}
//	@Test
//	public void first() {
//		driver.get(prop.getProperty("url"));
//		driver.manage().window().maximize();
//		driver.findElement(By.name("search_query")).sendKeys("Premier League goal of the week");
//		driver.findElement(By.id("search-icon-legacy")).click();
//	}
//}
