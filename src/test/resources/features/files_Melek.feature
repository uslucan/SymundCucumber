Feature: User should be able to upload a file, move or delete any selected file under the Files module
  Background:
    Given the user login with valid credentials
    When user navigates to "Files" module
  @wip
  Scenario: User can upload a file
    When user click the plus dropdown icon
    And user can upload file
    Then user can see "Sprint4_SampleFile" in the file list

  Scenario: User can create a new folder
    When user click the plus dropdown icon
    And user click New folder input box
    And user write the folder name as SampleFolder44 and click confirm icon
    Then user can see "SampleFolder44" in file list

