package com.cedaniel200.screenplay.starc.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features/insert_card.feature" },
        glue = { "com.cedaniel200.screenplay.starc.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class InsertCard {
}
