package loginmethods;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@smoke"},features="features",glue= {"loginmethods"},monochrome = true,
plugin = {"pretty","html:target/html.report"})

public class runner {

}
