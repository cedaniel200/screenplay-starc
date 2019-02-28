package com.cedaniel200.screenplay.starc.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InsertCard implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static InsertCard insertCard(){
        return instrumented(InsertCard.class);
    }
}
