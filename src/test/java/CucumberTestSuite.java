import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


/**
 * The JUnit Platform Suite Engine can be used to run Cucumber.
 * Source = https://github.com/cucumber/cucumber-jvm/tree/main/cucumber-junit-platform-engine
 *
 * @Suite: This annotation marks the class as a test suite. In Cucumber, a test suite is a collection of scenarios
 * (test cases) that are executed together.
 * @IncludeEngines: This annotation indicates that this test suite should include the Cucumber execution engines to run
 * tests written in Gherkin language.
 * @SelectClasspathResource: This annotation specifies the location of Cucumber feature files. In this case, the
 * feature files are expected to be in the classpath under the directory "/features." Feature files are plain text files
 * containing descriptions of test scenarios written in Gherkin language.
 * @ConfigurationParameter: This annotation configures the Cucumber reporting generator. It is used to specify which
 * reports should be generated and where they should be saved. In this case, it appears that a custom reporting
 * generator named "SerenityReporterParallel" is being used, which generates reports in a specific format.
 * The generated reports will be saved at the location "build/test-results/timeline.
 */

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
public class CucumberTestSuite {
}
