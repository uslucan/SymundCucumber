Feature: User should be able to upload a file, move or delete any selected file under the Files module
  Background:
    Given the user login with valid credentials
    When user navigates to "Files" module

  Scenario: User can upload a file
    When user click the plus dropdown icon
    Then user can upload file
  @wip
  Scenario: User can create a new folder
    When user click the plus dropdown icon
    And user click New folder input box
    And user write the folder name and click confirm icon
    Then user can see new created folder in file list

