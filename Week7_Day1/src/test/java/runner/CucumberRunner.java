package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features= "C:\\Users\\DRJR\\Reegan_Workspace\\Week7_Day1\\src\\test\\java\\feature", glue= {"steps"}, monochrome = true, publish = true)
public class CucumberRunner extends BaseClass{
}
