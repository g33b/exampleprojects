package org.aspectsecurity.cucumbertest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mgibeau on 3/16/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = "pretty",
        tags = {"~@Ignore"},
        features = "src/test/resources/"  //refer to Feature files
)
public class RunCukesTest {
}
