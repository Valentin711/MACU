package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber-report.json",
        "html:target/cucumber-report"})
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
