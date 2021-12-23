package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeature//ModuleOne.feature",
		glue = {"stepDefs"},
		dryRun=false,
		monochrome=true,
		plugin = {"pretty",
//				"usage:target/reports/usageReport",
//				"json:target/reports/jsonreport.json",
//				"junit:target/reports/junitReport.xml",
				"html:target/reports/htmlReport.html",
				"rerun:target/failed_scenarios.txt" //path of failed scenario
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
			}
		)
public class GooglePageRunner {

}
