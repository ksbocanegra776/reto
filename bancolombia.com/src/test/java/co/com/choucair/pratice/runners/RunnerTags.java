package co.com.choucair.pratice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/bancolombia.feature",
        tags = "@stories",
        glue = "co.com.choucair.pratice.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
