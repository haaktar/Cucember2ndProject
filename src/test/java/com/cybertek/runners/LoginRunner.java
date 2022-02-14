package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:target/cucumber-report.html",
        features = "src/main/resources/Login.feature",
        glue = "com/cybertek/stepdefinations",
        dryRun = false,
        tags = "@LoginWithBackground"


)


public class LoginRunner {


}