Feature: Deck Functionality
  As a user, I should be able to manage my works by creating a new board/list/card
  and modifying them under Deck Module.

  Background:
    Given the user login with valid credentials

  Scenario: User can create new board
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on Add board
    And user enters "Example Board" into "Board name"
    And user clicks add board arrow button
    Then user should be able to see "Example Board" under all boards