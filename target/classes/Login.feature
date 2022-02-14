@LoginWithBackground
Feature: As user I want to be able to log in under different roles

  Background: User is on the login page
    Given User is on the login page

  @Librarian
  Scenario: Login as sales librarian
    When Librarian users log in
    Then user should see dash board page

  @Student
  Scenario:Student parametrized login
    When Student log in as  Student
    Then Student should see dash board page

  @DB
  Scenario:Admin parametrized login
    When Admin log in as Student
    Then Admin should see dash board page