package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
glue= {"StepDefinitions"},
tags="@rahul")








//plugin= {"pretty","json:target\\JSONReports"},
// plugin= {"pretty","html:target\\Html Reports"},
//plugin= {"pretty","junit:target\\JunitReports",}
//tags="@smoketest")  

/*single tag we use tags={"@smoketest"}
*multiple tags with AND OR condition
*tags={"@smoketest and @regression"} 
**tags={"@smoketest and @regression"} if any scenario has both tag
*
*skip or ignore tags 
*tags={"@smoketest and not @regression"}
*tags={("@smoketest or @regression) and not @regression"}
*tags are placed above ghrkin elements 
*feature,scenario,scenario outline,examples
*

 * */

public class TestRunner {

}
