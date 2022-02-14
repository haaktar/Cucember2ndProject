package com.cybertek.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        System.out.println("User is on the login page");
    }

    @When("Librarian users log in")
    public void librarian_users_log_in() {
        System.out.println("Librarian users log in");
    }

    @Then("user should see dash board page")
    public void user_should_see_dash_board_page() {
        System.out.println("user should see dash board page");
    }

    @When("Student log in as  Student")
    public void student_log_in_as_student() {
        System.out.println("Student log in as  Student");
    }

    @Then("Student should see dash board page")
    public void student_should_see_dash_board_page() {
        System.out.println("Student should see dash board page");
    }

    @When("Admin log in as Student")
    public void admin_log_in_as_student() {

        System.out.println("Student log in as  Student");

    }

    @Then("Admin should see dash board page")
    public void admin_should_see_dash_board_page() {

        System.out.println("Admin should see dash board page");

    }

}
