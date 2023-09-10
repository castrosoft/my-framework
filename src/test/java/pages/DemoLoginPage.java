package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoLoginPage extends PageObject {
    public static final Target USERNAME_TEXTBOX = Target.the("Email textbox").located(By.id("Email"));
    public static final Target PASSWORD_TEXTBOX = Target.the("Password textbox").located(By.id("Password"));
    public static final Target SIGN_IN_BUTTON = Target.the("Sign In button").located(By.xpath("//button[contains(text(),'Log in')]"));
    public static final Target UNSUCCESSFUL_SIGN_IN_MESSAGE = Target.the("Unsuccessful sign in message").located(By.cssSelector("div.message-error.validation-summary-errors"));

}
