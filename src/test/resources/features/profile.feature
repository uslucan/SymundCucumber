Feature: User should be able to change profile info settings

  Background:
    Given the user login with valid credentials
    When the user clicks on the Avatar
    Then clicks on Settings
    When user lands on settings page

  Scenario: User can see the following titles
    Then the user is able to see the requested titles