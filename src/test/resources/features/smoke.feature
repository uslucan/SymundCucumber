@smokee
Feature: Symund Smoke Test

  Background:
    Given the user login with valid credentials

  Scenario: user can change view by clicking name button
    When user navigates to "Files" module
    Then user click name button and user should see folder view changed

  Scenario: User can change folder view order by Size
    When user navigates to "Files" module
    Then user click size button and user should see folder view changed

  Scenario: User can change folder view order by Modified
    When user navigates to "Files" module
    Then user click modified button and user should see folder view changed

  Scenario: User can change the folder view by clicking the toggle-view button
    When user navigates to "Files" module
    Then user click toggle-view button and user should see folder view changed

  Scenario: User can select all the files at once and see the total values of all files
  in the first line when clicked on the “select all” checkbox
    When user navigates to "Files" module
    And user can select all files when clicked select all checkbox
    Then user can see the total values of all files

#  Scenario: User can create new board
#    When user navigates to "Deck" module
#    And user clicks on navigation toggle
#    And user clicks on Add board
#    And user enters "Example Board" into "Board name"
#    And user clicks add board arrow button
#    Then user should be able to see "Example Board" under all boards
#
#  Scenario: User can create a new folder
#    When user navigates to "Files" module
#    When user click the plus dropdown icon
#    And user click New folder input box
#    And user write the folder name and click confirm icon
#    Then user can see folder in the file list
#//
#  Scenario: User can add any file to favorites from its own three dots menu
#    Given user navigates to "Files" module
#    When the user clicks the three-dot menu next to the "NYNewFolder"
#    And the user clicks on "Add to favorites" button on three-dot menu
#    Then user should see "NYNewFolder" folder in the Favorites feature
#
#  Scenario Outline: User can change Online Status --> <status>
#    When user clicks on status window on dashboard
#    And user change online status "<status>"
#    Then verify selected status is displayed in frame(selected) "<status>"
#    And user clicks on avatar button
#    Then verify selected status on avatar menu matches with actual status
#    Examples:
#      | status |
#      | Away   |
#      | Online |
#
#  Scenario Outline: User can display calendar views
#    And the user is on the calendar page
#    Given the user opens the calendar views menu on the left panel
#    When the user clicks on "<viewOption>" button
#    Then verify that "<viewOption>" calendar view is displayed
#
#    Examples:
#      | viewOption |
#      | day        |
#      | week       |
#      | month      |
#
#  Scenario: User can create new board
#    When user navigates to "Deck" module
#    And user clicks on navigation toggle
#    And user clicks on Add board
#    And user enters "Example Board" into "Board name"
#    And user clicks add board arrow button
#    Then user should be able to see "Example Board" under all boards
#
#  Scenario Outline: User can navigate to Dashboard page whenever clicking the Symund icon
#    When the user navigates to "<module>" page
#    And the user click on the Symund icon
#    Then the user should be able to navigate to "Dashboard" page
#    Examples:
#      |module  |
#      |files   |
#      |activity|
#      |talk    |
#      |mail    |
#      |notes   |
#
#  Scenario:User can create a new group conversation by adding other users
#
#    Given the user navigates to "talk" module
#    When the user clicks the plus button
#    And the user enters the conversation name as Group1
#    And the user clicks Add Participants button
#    And the user searches and selects "Employee91" via the search box
#    And the user searches and selects "Employee141" via the search box
#    And the user clicks the Create Conversation button
#    Then the user verifies that conversation group is created