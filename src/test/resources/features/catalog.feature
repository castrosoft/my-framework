@catalog
Feature: Catalog Page

  Background:
    Given I navigate to the demo page
    When I log in with valid credentials

  Scenario: Successful selected value from a dropdown element
    When I select "Computers" value in the Category dropdown
    Then I should see the selected products in the list
