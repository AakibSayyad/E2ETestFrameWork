package StepDefinations;
import java.util.*;
import java.io.*;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
public  class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	@Before
	public static  void setup() throws IOException {
	prop = new Properties();
	FileInputStream fis  = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/StepDefinations/prop.properties");
	prop.load(fis);
	String browser = prop.getProperty("browser");
	if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	if(browser.equals("edge")) {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	}
	}