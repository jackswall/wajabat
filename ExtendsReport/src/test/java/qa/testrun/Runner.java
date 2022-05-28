package qa.testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/qa/feature",
glue="qa/stepdefination",
monochrome=true,
tags="@login or @product",
plugin={"pretty","json:target/myreports/report.json",
					"junit:target/myreports/report.xml"},
publish = true)
public class Runner {

}
