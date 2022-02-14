package com.cybertek.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
        ;
    }
}
