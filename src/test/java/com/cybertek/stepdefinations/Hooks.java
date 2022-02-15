package com.cybertek.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void setUpScenario() {

        System.out.println("Setting up the Scenario");
        System.out.println();

    }

    @Before("@DB")
    public void setUpDatabaseConnection() {
        System.out.println("DB Connection is Created");
        System.out.println();

    }

    @After
    public void tearDownScenario() {
        System.out.println();
        System.out.println("Closing Browser");
    }

    @After("@DB")
    public void tearDownDatabaseConnection() {
        System.out.println();
        System.out.println("DB Connection Closed");

    }

    @BeforeStep
    public void setUpStep() {
        System.out.println("=========Before Step : Taking Screenshot=========");
    }

    @AfterStep
    public void tearDownStep() {
        System.out.println("============After Step : Taking Screenshot============");
    }
}
