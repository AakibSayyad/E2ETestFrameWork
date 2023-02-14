package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;

public class YouTubeTest extends Base {

	
	@Test
	public void first() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("Premier League goal of the week");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
}
