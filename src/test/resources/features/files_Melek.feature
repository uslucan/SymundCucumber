Feature: User should be able to upload a file, move or delete any selected file under the Files module
  Background:
    Given the user login with valid credentials
    When user navigates to "Files" module

@SYMU-1166 @smoke
  Scenario: User can upload a file
    When user click the plus dropdown icon
    And user can upload file
    Then user can see "Sprint4_SampleFile.txt" in the file list

@SYMU-1168
  Scenario: User can create a new folder
    When user click the plus dropdown icon
    And user click New folder input box
    And user write the folder name as "SampleFolder42" and click confirm icon
    Then user can see "SampleFolder42" in the file list

@SYMU-1169
  Scenario: User can move or copy any selected item to any folder
    When the user clicks the three-dot menu next to the "MSSourceFolder"
    And click "Move or copy" button
    When user choose "MSTargetFolder" as target folder
    And click Move to button that has fileName
    When user click "MSTargetFolder" on Files main page
    Then user should see "MSSourceFolder" in MSTargetFolder


