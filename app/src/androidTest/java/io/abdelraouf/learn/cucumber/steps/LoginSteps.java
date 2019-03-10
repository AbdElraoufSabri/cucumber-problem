package io.abdelraouf.learn.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
  @Given("^I have a LoginActivity")
  public void I_have_a_LoginActivity() {

  }

  @When("^I input email (\\S+)$")
  public void iInputEmailEmail(String email) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @And("^I input password (\\S+)$")
  public void iInputPasswordPassword(String password) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @And("^I press submit button$")
  public void iPressSubmitButton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }

  @Then("^I should (true|false) auth error$")
  public void iShouldSeeAuthError() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
  }
}
