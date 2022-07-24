package co.com.minagri1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescargarPdfUser {
    public static final Target BTN_PCGESTION =Target.the("Boton planeacion control y gestion").located(By.xpath("//*[@id='menubar3']/li[5]/a"));
    public static final Target BTN_INFO_CONT_FINANC =Target.the("Boton información contable y financiera").locatedBy("//*[@id='menubar3']/li[5]/ul/li[3]/a");
    public static final Target BTN_EST_CONT_2015 =Target.the("Boton Estados contables 2015").located(By.id("89"));
    public static final Target BTN_ENE_MAR_2015 =Target.the("Boton ENERO MARZO 2015").locatedBy("//*[@id='90']/a");
    public static final Target BTN_CERT_FINANC_MAR_2015 =Target.the("Boton CERTIFICACION INFORMACIÖN FINANC 2015").locatedBy("//*[@id='92']/a");


}
