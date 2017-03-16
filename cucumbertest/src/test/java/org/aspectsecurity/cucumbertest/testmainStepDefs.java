package org.aspectsecurity.cucumbertest;

/**
 * Created by mgibeau on 3/16/2017.
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class testmainStepDefs {

    String testInput = "";
    String testOutput = "";



    @Given("^We supply an input to doTest$")
    public void givendoTest() throws Throwable {
        testInput = "Hi!";
    }

    @When("^We run the doTest method$")
    public void we_run_the_doTest_method() throws Throwable {
        testOutput = testmain.doTest(testInput);
    }

    @Then("^We get the expected output$")
    public void we_get_the_expected_output() throws Throwable {
        assertThat(testOutput,is("just a test "+testInput));
    }



    @Given("^We pass \"([^\"]*)\" to doTest$")
    public void we_pass_to_doTest(String arg1) throws Throwable {
        testInput = arg1;
    }

    @When("^we run the doTest method$")
    public void we_run_the_doTest2_method() throws Throwable {
        testOutput = testmain.doTest2(testInput);
    }

    @Then("^we get \"([^\"]*)\"$")
    public void we_get(String arg1) throws Throwable {
        assertThat(testOutput,is(arg1));
    }






}
