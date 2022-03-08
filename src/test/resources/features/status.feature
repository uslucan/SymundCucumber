Feature: Online Status Functionality

  Background:
    Given the user login with valid credentials
    When user clicks on status window on dashboard


  Scenario: User can view Online Status
    Then verify selected status is displayed in frame(selected)
    And user clicks on avatar button
    Then verify selected status on avatar menu matches with actual status


  Scenario Outline: User can change Online Status --> <status>
    And user change online status "<status>"
    Then verify selected status is displayed in frame(selected) "<status>"
    And user clicks on avatar button
    Then verify selected status on avatar menu matches with actual status
    Examples:
      | status |
      | Away   |
      | Online |


  Scenario: User can set a status message from any default options
    And user chooses one of the status messages randomly
    Then verify chosen message is displayed on status window

  Scenario: User can set a custom status message with also using any emoji option provided
    When user types a message into custom message box "some sort of message here"
    And user chooses a random emoji
    And user sets the custom status message
    Then verify chosen message is displayed on status window

