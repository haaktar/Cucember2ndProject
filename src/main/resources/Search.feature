Feature: Search on Google.com

  Background: User is on the login page
    Given User is on the login page

  Scenario: Goole default title verification
    Then user should see the google in the title


  Scenario: Google title verification after search
    When user on google.com
    Then user should see the apple in the title