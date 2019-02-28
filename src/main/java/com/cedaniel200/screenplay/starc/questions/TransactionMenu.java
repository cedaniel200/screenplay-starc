package com.cedaniel200.screenplay.starc.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TransactionMenu implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return false;
    }

    public static TransactionMenu isVisible() {
        return new TransactionMenu();
    }
}
