package TestRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(features ={"src/test/resources/Amazon.feature"}
,glue = {"StepDefinations"}
)
public class TestRunnerClass extends  AbstractTestNGCucumberTests{
}
