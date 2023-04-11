package StepDefinations;
import java.util.*;
import java.io.*;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public  class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static EdgeOptions options;
	
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
	@After
	public void close() {
		driver.close();
	}
	}