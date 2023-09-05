package stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.DemoLoginPage;
import tasks.EnterCredentials;
import tasks.NavigateTo;
import utils.FrameworkProperties;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinition {

    private final FrameworkProperties frameworkProperties = new FrameworkProperties();
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginStepDefinition.class);

    @Given("{actor} navigate to the demo page")
    public void i_navigate_to_the_demo_page(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theLoginPage()
        );
    }

    @When("I log in with valid credentials")
    public void i_log_in_with_valid_credentials() {
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty("email"), frameworkProperties.getProperty("password"));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty("email")).andPassword(frameworkProperties.getProperty("password"))
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
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty("email"), frameworkProperties.getProperty("invalid-password"));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty("email")).andPassword(frameworkProperties.getProperty("invalid-password"))
        );
    }

    @Then("I should see the message {string}")
    public void i_should_be_unsuccessfully_logged_in(String message) {
        then(theActorInTheSpotlight()).attemptsTo(
                Ensure.that(DemoLoginPage.UNSUCCESSFUL_SIGN_IN_MESSAGE).hasTextContent("Login was unsuccessful. Please correct the errors and try again.\n" +
                        message)
        );
    }

    @When("I log in with an invalid email")
    public void i_log_in_with_an_invalid_email() {
        LOGGER.info("The username is {} and the password is {}", frameworkProperties.getProperty("invalid-email"), frameworkProperties.getProperty("password"));
        when(theActorInTheSpotlight()).attemptsTo(
                EnterCredentials.withUsername(frameworkProperties.getProperty("invalid-email")).andPassword(frameworkProperties.getProperty("password"))
        );
    }

}
