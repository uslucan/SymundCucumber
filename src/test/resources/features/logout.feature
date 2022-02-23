@SYMU-1106
Feature: logout feature
  Agile Story: As a user, I should be able to log out.

  Background:
    Given the user is on the login page
    And the user enters valid credentials

  @SYMU-1105
  Scenario: User can log out and ends up in login page
    And user clicks on avatar button
    When user clicks on the logout option
    Then the page title should be "Symund - QA"
    When user clicks on navigate back
    Then the page title should be "Symund - QA"


