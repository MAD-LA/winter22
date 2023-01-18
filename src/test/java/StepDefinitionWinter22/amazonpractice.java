package StepDefinitionWinter22;

import Utility.Base_amazon;
import cucumber.api.java.en.Given;

public class amazonpractice extends Base_amazon {

	

@Given("^WinterLaunch \"([^\"]*)\"$")
public void winterlaunch(String URL) throws Throwable {
	winterLaunchURL(URL);
  
	
}

	
}
