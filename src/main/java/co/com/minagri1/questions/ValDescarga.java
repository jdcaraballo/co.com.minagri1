package co.com.minagri1.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.minagri1.userinterface.ValidationDescargaPdf.VAL_DESC_PDF;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValDescarga implements Question {


    @Override
    public Boolean answeredBy(Actor actor) {
        if(VAL_DESC_PDF.resolveFor(actor).isVisible())
            return true;
            return false;
    }

    public static ValDescarga enPagina() {
        return new ValDescarga();
    }
}
