package stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import pages.DemoLoginPage;
import tasks.EnterCredentials;
import tasks.NavigateTo;
import utils.FrameworkProperties;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinition {

    private final FrameworkProperties frameworkProperties = new FrameworkProperties();

    @Given("{actor} navigate to the demo page")
    public void i_navigate_to_the_demo_page(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theLoginPage()
        );
    }

    @When("I log in with valid credentials")
    public void i_log_in_with_valid_credentials() {
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty("username")).andPassword(frameworkProperties.getProperty("password"))
        );
    }

    @Then("I should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
        then(theActorInTheSpotlight()).attemptsTo(
                Ensure.that(DemoLoginPage.SIGN_IN_BUTTON).isNotDisplayed()
        );

    }

}
