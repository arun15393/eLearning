package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",strict=true,tags= {},glue="stepdefinition",plugin= {"html:target"})
public class TestRunner {

}
