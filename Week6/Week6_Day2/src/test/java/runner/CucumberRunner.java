package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features= "C:\\Users\\DRJR\\Reegan_Workspace\\Week6_Day2\\src\\test\\java\\feature", glue= {"steps"}, monochrome = true, publish = true)
public class CucumberRunner extends BaseClass{
}
