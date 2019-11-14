package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {


    @Given("I open a website")
    public void iOpenAWebsite() {
        Assert.assertTrue(true);
        System.out.println("Passed first step");
    }

    @When("I click on a link")
    public void iClickOnALink() {
        Assert.assertTrue(true);
        System.out.println("Passed second step");
    }

    @Then("I am on a new webpage")
    public void iAmOnANewWebpage() {
        Assert.assertTrue(true);
        System.out.println("Passed third step");
        System.out.println("End of test");
    }
}
