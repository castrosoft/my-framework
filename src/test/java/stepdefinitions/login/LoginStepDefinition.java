package stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.DemoLoginPage;
import questions.UnsuccessfulMessage;
import tasks.EnterCredentials;
import tasks.NavigateTo;
import utils.Constants;
import utils.FrameworkProperties;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;


public class LoginStepDefinition {

    private final FrameworkProperties frameworkProperties = new FrameworkProperties();
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginStepDefinition.class);

    @Given("{actor} navigate to the demo page")
    public void i_navigate_to_the_demo_page(Actor actor) {
        LOGGER.info("The URL by default is: {}", Constants.WEBDRIVER_BASE_URL);
        actor.wasAbleTo(
                NavigateTo.theLoginPage()
        );
    }

    @When("I log in with valid credentials")
    public void i_log_in_with_valid_credentials() {
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty(Constants.EMAIL), frameworkProperties.getProperty(Constants.PASSWORD));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty(Constants.EMAIL)).andPassword(frameworkProperties.getProperty(Constants.PASSWORD))
        );
    }

    @Then("I should be successfully logged in")
    public void i_should_be_successfully_logged_in() {
        then(theActorInTheSpotlight()).attemptsTo(
                Ensure.that(DemoLoginPage.SIGN_IN_BUTTON).isNotDisplayed()
        );

    }

    @When("I log in with an invalid password")
    public void i_log_in_with_an_invalid_password() {
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty(Constants.EMAIL), frameworkProperties.getProperty(Constants.INVALID_PASSWORD));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty(Constants.EMAIL)).andPassword(frameworkProperties.getProperty(Constants.INVALID_PASSWORD))
        );
    }

    @Then("I should see the message {string}")
    public void i_should_be_unsuccessfully_logged_in(String message) {
        then(theActorInTheSpotlight()).should(
                seeThat("The unsuccessful message", UnsuccessfulMessage.displayed(), containsString(message))
        );
    }

    @When("I log in with an invalid email")
    public void i_log_in_with_an_invalid_email() {
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty(Constants.INVALID_EMAIL), frameworkProperties.getProperty(Constants.PASSWORD));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty(Constants.INVALID_EMAIL)).andPassword(frameworkProperties.getProperty(Constants.PASSWORD))
        );
    }

}
