@ab
Feature: Deleted Files Feature

  As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Background:
    Given the user login with valid credentials
    When the user clicks the Files module
    Then Click the Deleted Files module which is lower left corner

  Scenario: Verify User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
    Given Order the deleted files by newest to oldest
    Then Verify that the user can see the most recent deleted file in the first line

  Scenario: Verify that user can order the all deleted files by newest to oldest or visa versa
    Given Click the triangle which is near the Deleted element on the right corner
    Then Verify that the user can order the all deleted files by newest to oldest or vice versa

  Scenario: Verify that user can order alphabetically all the deleted files based on their names
    Given Click the Name element which is top of the deleted files
    Then Verify that the user can order alphabetically the all deleted files based on their names

    Scenario: Verify that user can delete any deleted file permanently by using the three dots icon
      Given Click the … (three dot) element which is near the Restore button
      And Click Delete permanently element.


    Scenario: Verify that user can restore any deleted file and see it again under the All Files Tab
        Given Click the Restore element which is near the …(three dot) element
        And Navigate to All Files page by clicking the All Files which is top left corner of the Deleted files page
        Then Verify that the user can see the restored file.