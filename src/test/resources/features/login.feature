@demo-login

Feature: Demo Login

  Scenario: Successful login with valid credentials
    Given I navigate to the demo page
    When I log in with valid credentials
    Then I should be successfully logged in
