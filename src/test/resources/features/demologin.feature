@demo-login

Feature: Demo Login

  Background:
    Given I navigate to the demo page

  Scenario: Successful login with valid credentials
    When I log in with valid credentials
    Then I should be successfully logged in

  Scenario: Unsuccessful login with an invalid password
    When I log in with an invalid password
    Then I should see the message 'The credentials provided are incorrect'

  Scenario: Unsuccessful login with invalid email
    When I log in with an invalid email
    Then I should see the message 'No customer account found'
