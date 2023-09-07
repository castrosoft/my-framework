package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.DemoLoginPage;

public class OverviewData {

    public static Question<String> creditAvailable() {
        return actor -> Text.of(DemoLoginPage.UNSUCCESSFUL_SIGN_IN_MESSAGE).asString().answeredBy(actor);
        // return actor -> BrowseTheWeb.as(actor).findAll(".todo-list li").size();
        // return actor -> BrowseTheWeb.
        // Text.of(DashboardPage.VERSION_LABEL).viewedBy(theActorInTheSpotlight()).asString();
    }
}
