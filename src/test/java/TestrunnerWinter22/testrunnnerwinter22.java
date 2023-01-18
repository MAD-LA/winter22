package TestrunnerWinter22;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_amazon;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature_files"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionWinter22") //tags = {"@Cart"})


public class testrunnnerwinter22 extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void wintersetup () {
		Base_amazon test = new Base_amazon();
		test.winterbrowserinit();
	}
	
	
	@AfterTest
	public void wintercloseurl () {
		Base_amazon test = new Base_amazon();
		test.driver.quit();
		
	}

}



