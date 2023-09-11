package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pages.leftmenu.DemoLoginPage;

public class NavigateTo {

    public static Performable theLoginPage() {
        return Task.where("{0} opens the Demo login page",
                Open.browserOn().the(DemoLoginPage.class));
    }
}
