Feature: Search and Photos Functionality

  Background:
    Given the user login with valid credentials

  Scenario: User can search file from the Dashboard
    When the user click on the magnifying icon
    And the user enter a file name
    And the user should be able to find and click on the file
    Then the user should be able to see the details side page of the file