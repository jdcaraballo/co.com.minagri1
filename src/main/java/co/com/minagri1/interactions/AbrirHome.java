package co.com.minagri1.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirHome implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://www.minagricultura.gov.co/paginas/default.aspx")
        );
    }
    public static AbrirHome enPagina() {
        return instrumented(AbrirHome.class);
    }
}
