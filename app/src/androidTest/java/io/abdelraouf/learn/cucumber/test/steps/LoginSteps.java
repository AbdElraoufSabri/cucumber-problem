package io.abdelraouf.learn.cucumber.test.steps;

import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.abdelraouf.learn.cucumber.MainActivity;
import org.junit.Rule;

public class LoginSteps {

  @Rule ActivityTestRule rule = new ActivityTestRule<>(MainActivity.class, false, false);

  /**
   * We launch the activity in Cucumber's {@link Before} hook.
   * See the notes above for the reasons why we are doing this.
   *
   * @throws Exception any possible Exception
   */
  @Before
  public void launchActivity() throws Exception {
    rule.launchActivity(null);
  }

  /**
   * All the clean up of application's data and state after each scenario must happen here
   */
  @After
  public void finishActivity() throws Exception {
    getActivity().finish();
  }
  private Activity getActivity() {
    return rule.getActivity();
  }

  @Given("^I have a LoginActivity")
  public void I_have_a_LoginActivity() {
  }

  @When("^I input email (\\S+)$")
  public void iInputEmailEmail(String email) throws Throwable {
    System.out.println(email);
  }

  @And("^I input password (\\S+)$")
  public void iInputPasswordPassword(String password) throws Throwable {
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

  @Then("^I get loggedIn true$")
  public void iGetLoggedInTrue() throws Throwable {
  }
}
