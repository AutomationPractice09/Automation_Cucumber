package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/* 
  to run single tag scenarios --> tags="@Code"
  to run two/multiple scenarios --> tags="@Code or @Audio"
  to not run any scenario--> tags="not @Code"
  to not run two/multiple scenarios --> first add tag @ignore to feature file for that scenario and then
                                        add tags="not @ignore"
*/


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\ThemeForest.feature",
                   glue="stepDef",
                   tags="Code")
public class ThemeforestRunner {

}
