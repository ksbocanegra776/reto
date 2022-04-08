package co.com.choucair.pratice.tasks;

import co.com.choucair.pratice.userinterface.CreditSimulationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.pratice.userinterface.CreditSimulationPage.*;

public class CreditSimulation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIMULATES),
                Click.on(BTN_HOME_VALUE_SIMULATOR),
                Enter.theValue("160000000").into(INPUT_SIMULATION_VALUE),
                SelectFromOptions.byVisibleText("70%").from(BTN_PERCENTAGE) ),
                Enter.theValue("20").into(INPUT_VALOR_YEAR),



        );
    }

    }
}
