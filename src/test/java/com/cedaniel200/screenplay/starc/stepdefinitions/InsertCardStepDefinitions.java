package com.cedaniel200.screenplay.starc.stepdefinitions;

import com.cedaniel200.screenplay.starc.questions.TransactionMenu;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.screenplay.starc.tasks.InsertCard.insertCard;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class InsertCardStepDefinitions {

    private static final String CESAR = "Cesar";

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^I insert the card$")
    public void insertTheCard() {
        theActorCalled(CESAR).attemptsTo(
                insertCard()
        );
    }

    @Then("^you should see that the transaction menu to be made$")
    public void youShouldSeeThatTheTransactionMenuToBeMade() {
        theActorInTheSpotlight().should(seeThat(TransactionMenu.isVisible()));
    }
}
