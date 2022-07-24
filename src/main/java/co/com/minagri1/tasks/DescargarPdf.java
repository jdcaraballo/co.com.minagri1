package co.com.minagri1.tasks;

import co.com.minagri1.interactions.esperas.Esperar;
import co.com.minagri1.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.minagri1.userinterface.DescargarPdfUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarPdf implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BTN_PCGESTION),
                MoveMouse.to(BTN_PCGESTION),
                Click.on(BTN_INFO_CONT_FINANC),
                Scroll.to(BTN_EST_CONT_2015),
                Click.on(BTN_EST_CONT_2015),
                Click.on(BTN_ENE_MAR_2015),
                Click.on(BTN_CERT_FINANC_MAR_2015),
                Esperar.unTiempo(2000)

        );
    }
    public static DescargarPdf enPagina() {
    return instrumented(DescargarPdf.class);}
}
