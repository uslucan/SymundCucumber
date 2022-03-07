Feature: Online Status Functionality

  Background:
    Given the user login with valid credentials


  Scenario: User can view Online Status
    Then user clicks on status window on dashboard
    Then verify selected status is displayed in frame(selected)
    And user clicks on avatar button
    Then verify selected status on avatar menu matches with actual status


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

