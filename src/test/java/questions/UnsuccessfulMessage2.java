package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.leftmenu.DemoLoginPage;

public class UnsuccessfulMessage2 {
    public static Question<String> displayed2() {
        return actor -> Text.of(DemoLoginPage.UNSUCCESSFUL_SIGN_IN_MESSAGE).answeredBy(actor);
    }
}
