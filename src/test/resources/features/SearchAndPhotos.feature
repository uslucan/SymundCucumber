Feature: Search and Photos Functionality

  Background:
    Given the user login with valid credentials

  Scenario: User can search file from the Dashboard
    When the user click on the magnifying icon
    And the user enter a file name
    And the user should be able to find and click on the file
    Then the user should be able to see the details side page of the file

  Scenario Outline: User can navigate to Dashboard page whenever clicking the Symund icon
    When the user navigates to "<module>" page
    And the user click on the Symund icon
    Then the user should be able to navigate to "Dashboard" page
    Examples:
      |module  |
      |files   |
      |activity|
      |talk    |
      |mail    |
      |notes   |


    Scenario: User can search contacts from Dashboard
    When the user click on the contacts search icon
    And the user enter a contact name
    Then the user should be able to see the contact name in search result

  Scenario: User can see the image files under Photos Module
    When the user navigates to "Files" page
    And  the user click on the plus icon
    And  the user click on upload file and upload the an "sprint4.jpg" file
    And  the user navigates to "Photos" page
    Then user should be able to see uploaded "sprint4.jpg" file on Photos page

