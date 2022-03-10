Feature: Online Status Functionality

  Background:
    Given the user login with valid credentials

@SYMU-1199
  Scenario: User can view Online Status
    When user clicks on status window on dashboard
    Then verify selected status is displayed in frame(selected)
    And user clicks on avatar button
    Then verify selected status on avatar menu matches with actual status

@SYMU-1200
  Scenario Outline: User can change Online Status --> <status>
    When user clicks on status window on dashboard
    And user change online status "<status>"
    Then verify selected status is displayed in frame(selected) "<status>"
    And user clicks on avatar button
    Then verify selected status on avatar menu matches with actual status
    Examples:
      | status |
      | Away   |
      | Online |

  @SYMU-1201
  Scenario: User can set a status message from any default options
    When user clicks on status window on dashboard
    And user chooses one of the status messages randomly
    Then verify chosen message is displayed on status window

  @SYMU-1202
  Scenario: User can set a custom status message with also using any emoji option provided
    When user clicks on status window on dashboard
    When user types a message into custom message box "some sort of message here"
    And user chooses a random emoji
    And user sets the custom status message
    Then verify chosen message is displayed on status window

