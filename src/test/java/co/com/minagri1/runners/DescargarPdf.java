package co.com.minagri1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/descargarpdf.feature",
        glue = "co.com.minagri1.stepdefinitions.descargarpdf",
        snippets = SnippetType.CAMELCASE
)

public class DescargarPdf {
}
