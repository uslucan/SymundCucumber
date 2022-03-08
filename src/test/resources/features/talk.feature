
Feature: Talk Functionality

  #As a user, I should be able to create/delete conversation groups and chat with other co-workers under Talk Module

  Background:
    When the user login with valid credentials

  Scenario:User can create a new group conversation by adding other users

    Given the user navigates to "talk" module
    When the user clicks the plus button
    And the user enters the conversation name as Group1
    And the user clicks Add Participants button
    And the user searches and selects "Employee91" via the search box
    And the user searches and selects "Employee141" via the search box
    And the user clicks the Create Conversation button
    Then the user verifies that conversation group is created


  Scenario: User can see the participants of the conversation on the right-hand menu under Participants

    Given the user navigates to "talk" module
    When the user clicks the plus button
    And the user enters the conversation name as Group1
    And the user clicks Add Participants button
    And the user searches and selects "Employee91" via the search box
    And the user searches and selects "Employee141" via the search box
    And the user clicks the Create Conversation button
    Then the user verifies that participants can be seen on the right-hand menu

  Scenario: User can remove any participant from the conversation as being moderator of the conversation

    Given the user navigates to "talk" module
    When the user clicks the plus button
    And the user enters the conversation name as Group1
    And the user clicks Add Participants button
    And the user searches and selects "Employee91" via the search box
    And the user searches and selects "Employee141" via the search box
    And the user clicks the Create Conversation button
    Then the user verifies that conversation group is created
    When the user removes a participant from the conversation and verifies it is removed


  Scenario: User can send messages by typing inside the inputbox

    Given the user navigates to "talk" module
    When the user clicks the plus button
    And the user enters the conversation name as Group1
    And the user clicks Add Participants button
    And the user searches and selects "Employee91" via the search box
    And the user searches and selects "Employee141" via the search box
    And the user clicks the Create Conversation button
    When the user sends a message by typing in the inputbox and verifies it is sent


  Scenario: User can delete any group conversation previously created

    Given the user navigates to "talk" module
    When the user clicks the plus button
    And the user enters the conversation name as Group1
    And the user clicks Add Participants button
    And the user searches and selects "Employee91" via the search box
    And the user searches and selects "Employee141" via the search box
    And the user clicks the Create Conversation button
    And the user verifies that conversation group is created
    Then the user deletes the created group and verifies that the group is deleted

