package cucupackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\new sts\\Cucumber\\log_in.feature",
glue = "cucupackage"
         )

public class Testrunner {

}
