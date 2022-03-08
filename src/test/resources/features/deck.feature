Feature: Deck Functionality
  As a user, I should be able to manage my works by creating a new board/list/card
  and modifying them under Deck Module.

  Background:
    Given the user login with valid credentials
  @SYMU-1178 #smoke
  Scenario: User can create new board
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on Add board
    And user enters "Example Board" into "Board name"
    And user clicks add board arrow button
    Then user should be able to see "Example Board" under all boards
  @SYMU-1179
  Scenario: User can create new list of card/task under any board
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on the board "Example Board"
    And user clicks on Add list button
    And user enters "Example List" into "List name"
    And user clicks add list arrow button
    Then user should be able to see "Example List" in "Example Board"
  @SYMU-1180
  Scenario: User can create new card/task on any list under the current board
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on the board "Example Board"
    And user clicks on Add card button under list "Example List"
    And user enters "Example Task" into "Card name"
    And user clicks add card arrow button
    Then user should be able to see card "Example Task" on the list "Example List"
  @SYMU-1181
  Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on the board "Example Board"
    And user clicks on three dots under card "Example Task"
    And user clicks on "Assign to me" under three dot options
    Then user should be able to see avatar icon on the task "Example Task"
  @SYMU-1182
  Scenario: User can move any card on the current board to any other list of other board
    When user navigates to "Deck" module
    And user clicks on navigation toggle
    And user clicks on the board "Example Board"
    And user clicks on three dots under card "Example Task"
    And user clicks on "Move card" under three dot options
    And user clicks on "Select a board" and chooses "Personal"
    And user clicks on "Select a list" and chooses "To do"
    And user clicks on move card button
    And user clicks on the board "Personal"
    Then user should be able to see card "Example Task" on the list "To do"