package pages.leftmenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class CatalogPage extends PageObject {

    public static Target CATEGORY_DROPDOWN = Target.the("Category dropdown").located(By.id("SearchCategoryId"));

    // This is a generic locator
    public static Target getMenu(String menuText) {
        String baseXPath = "//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']";
        String fullXPath = String.format("%s//p[contains(text(), '%s')]", baseXPath, menuText);
        return Target.the(menuText + " dropdown").located(By.xpath(fullXPath));
    }

}
