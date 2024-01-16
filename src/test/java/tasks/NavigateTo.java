package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pages.leftmenu.CatalogPage;
import pages.leftmenu.DemoLoginPage;
import utils.Constants;

public class NavigateTo {

    public static Performable theLoginPage() {
        return Task.where("{0} opens the Demo login page",
                Open.browserOn().the(DemoLoginPage.class));
    }

    public static Performable theProductsPage(String value) {
        return Task.where("{0} click to the menus",
                Click.on(CatalogPage.getMenu(Constants.CATALOG)),
                Click.on(CatalogPage.getMenu(Constants.PRODUCTS)),
                SelectFromOptions.byVisibleText(value).from(CatalogPage.CATEGORY_DROPDOWN)
        );
    }
}
