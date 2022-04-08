package co.com.choucair.pratice.stepdefinitions;

import co.com.choucair.pratice.tasks.CreditSimulation;
import co.com.choucair.pratice.tasks.LeasingProduct;
import co.com.choucair.pratice.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SimulacionCreditoStepDefination {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Karina enter Bancolombia's escrow account$")
    public void thanKarinaEnterBancolombiaSEscrowAccount() {
        theActorCalled("Karina").wasAbleTo(OpenUp.thePage());
    }


    @When("^select the housing leasing product$")
    public void selectTheHousingLeasingProduct() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                LeasingProduct.leasinghousing()
        );

    }

    @When("^performs the credit simulation$")
    public void performsTheCreditSimulation() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CreditSimulation.creditsimulation()
        );
    }

    @Then("^you can view credit rates and fees$")
    public void youCanViewCreditRatesAndFees() throws Exception {

    }

}
