@filesRun
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
    And user write the folder name and click confirm icon
    Then user can see folder in the file list

@SYMU-1184
  Scenario: User can delete any selected item from its three dots menu
    When select a folder
    And the user clicks the three dot menu next to the new created folder and click "Delete folder" button
    When User click Deleted files on the left bottom of page
    Then user should see deleted folder in list

@SYMU-1169
  Scenario: User can move or copy any selected item to any folder
    When after a folder is selected
    When the user clicks the three dot menu next to the folder name
    And click "Move or copy" button
    When user choose "MSTargetFolder" as target folder
    And click Move to button that has fileName
    When user click "MSTargetFolder" on Files main page
    Then user should see moved folder in MSTargetFolder

@SYMU-1185
  Scenario: User can see the total number of files and folders under the files list table









