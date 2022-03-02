Feature: User should be able to upload a file, move or delete any selected file under the Files module
  Background:
    Given the user login with valid credentials
 @wip
  Scenario: User can upload a file
    When user navigates to "Files" module
    When user click the plus dropdown icon
    And user click the upload button

