Feature: User should be able to add a file to favorites, rename any file and give some comments on any file.

  Background:
    Given the user login with valid credentials
    Given user navigates to "Files" module

  @SYMU-1159
  Scenario: User can add any file to favorites from its own three dots menu
    When the user clicks the three-dot menu next to the "NYNewFolder"
    And the user clicks on "Add to favorites" button on three-dot menu
    Then user should see "NYNewFolder" folder in the Favorites feature


  @SYMU-1160
  Scenario: User can User can rename any file from its own three dots menu

  @SYMU-1161
  Scenario: User can put some comments on any file from the file details menu opened right side

  @SYMU-1162
  Scenario: User can delete the comments made on any file from the the file details menu opened right side

