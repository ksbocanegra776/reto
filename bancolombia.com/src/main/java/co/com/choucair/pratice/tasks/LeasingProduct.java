package co.com.choucair.pratice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.pratice.userinterface.LeasingProductPage.BTN_REQUEST_PRODUCT;
import static co.com.choucair.pratice.userinterface.LeasingProductPage.LINK_LEASING_HOUSING;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LeasingProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REQUEST_PRODUCT),
                Click.on(LINK_LEASING_HOUSING)
        );
    }

    public static LeasingProduct leasinghousing(){
        return instrumented(LeasingProduct.class);
    }
}
