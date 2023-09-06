package utils;

import net.serenitybdd.core.environment.WebDriverConfiguredEnvironment;
import static net.serenitybdd.core.environment.EnvironmentSpecificConfiguration.*;
public class Constants {
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";
    public static final String INVALID_EMAIL = "invalid-email";
    public static final String INVALID_PASSWORD = "invalid-password";
    public static final String UNSUCCESSFUL_LOGIN_MESSAGE = "Login was unsuccessful. Please correct the errors and try again.";
    public static final String WEBDRIVER_BASE_URL = from(WebDriverConfiguredEnvironment.getEnvironmentVariables()).getProperty("webdriver.base.url");
}
