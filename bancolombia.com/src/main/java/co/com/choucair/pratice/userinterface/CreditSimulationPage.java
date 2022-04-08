package co.com.choucair.pratice.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreditSimulationPage extends PageObject {
    public static final Target BTN_SIMULATES=Target.the("Ingress simulates").located(By.xpath("//a[contains(text(),'Simula')]"));
    public static final Target BTN_HOME_VALUE_SIMULATOR=Target.the("Ingress to the simulator, according to the value of the home").located(By.xpath("//div[@id='calcular-cuotas']"));
    public static final Target INPUT_SIMULATION_VALUE=Target.the("Ingress home value").located(By.xpath("//input[@id='valor-simulation']"));
    public static final Target BTN_PERCENTAGE=Target.the("Ingress percentage needed").located(By.id("id=mat-input-8"));
    public static final Target INPUT_VALOR_YEAR=Target.the("Ingress the years of the credit value").located(By.xpath("//input[@id='valor-year']"));
    public static final Target SELECT_DATE=Target.the("Select the date of your birth").located(By.xpath("//input[@id='campo-fecha']"));
    public static final Target BTN_OF_SIMULATE=Target.the("click the simulate button").located(By.xpath("//button[@id='boton-simular']"));
}
