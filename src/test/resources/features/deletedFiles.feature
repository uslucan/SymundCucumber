@ab
Feature: Deleted Files Feature

  Background:
    Given the user login with valid credentials
    When the user clicks the Files module


    Scenario: Verify User can see the most recent deleted file in the first line of the deleted file list when deleted files are ordered by newest to oldest
      Then Click the Deleted Files module which is lower left corner