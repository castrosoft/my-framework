package stepdefinitions.catalog;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CatalogDefinitions {

    @When("I select {string} value in the Category dropdown")
    public void iSelectAValueInTheCategoryDropdown(String valueSelected) {
        when(theActorInTheSpotlight()).attemptsTo(
                NavigateTo.theProductsPage(valueSelected)
        );
    }

    @Then("I should see the selected products in the list")
    public void iShouldSeeTheSelectedProductsInTheList() {


    }
}
