package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.DemoLoginPage;

public class UnsuccessfulMessage implements Question<String> {

    public static UnsuccessfulMessage displayed() {
        return new UnsuccessfulMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DemoLoginPage.UNSUCCESSFUL_SIGN_IN_MESSAGE).answeredBy(actor);
    }
}
