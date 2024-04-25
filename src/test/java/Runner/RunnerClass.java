package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Practice\\CucumberSampleProject\\src\\test\\resources\\Feature\\SweetBuying.feature",
glue="org.step")
public class RunnerClass {

}
