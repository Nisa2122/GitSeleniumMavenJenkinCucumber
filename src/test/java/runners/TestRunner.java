//integration of cucumber with testng
package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resources//Features//GoogleSearchParameter.feature","src//test//resources//Features//GoogleSearch.feature"},
glue = "stepDefinition",
monochrome=true,
dryRun = false,
plugin = {"pretty"
, "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests  {

}
