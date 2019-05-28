import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
monochrome = true, 
glue = {"com.Cucumber.qa.glue"},
features = { "E:\\Maven\\CucumberEx\\src\\main\\java\\com\\Cucumber\\qa\\glue\\Test.feature" }


)

public class RunWebsiteTest {

	

}
