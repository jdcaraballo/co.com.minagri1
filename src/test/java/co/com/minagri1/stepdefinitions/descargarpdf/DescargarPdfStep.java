package co.com.minagri1.stepdefinitions.descargarpdf;

import co.com.minagri1.interactions.AbrirHome;
import co.com.minagri1.questions.ValDescarga;
import co.com.minagri1.tasks.DescargarPdf;
import co.com.minagri1.userinterface.ValidationDescargaPdf;
import cucumber.api.java.en.*;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.minagri1.userinterface.ValidationDescargaPdf.VAL_DESC_PDF;

public class DescargarPdfStep {

    @Given("^que (.*) abre pagina$")
    public void queDavidAbrePagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirHome.enPagina()
        );
    }

    @When("^el descarga pdf$")
    public void elDescargaPdf() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DescargarPdf.enPagina()
        );
    }

    @Then("^se vera mensaje de descarga Ok$")
    public void seVeraMensajeDeDescargaOk() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValDescarga.enPagina()));

    }
}
