package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/Test1.feature",
		"src/test/java/features/test2.feature" }, glue = "StepDefinations", monochrome = true)
public class testRunner extends AbstractTestNGCucumberTests {

}
