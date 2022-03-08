@smoke
Feature:User can change folder view order

  Background:
    Given the user login with valid credentials
  @SYMU-1172
  Scenario: user can change view by clicking name button
    When user navigates to "Files" module
    Then user click name button and user should see folder view changed
  @SYMU-1173
  Scenario: User can change folder view order by Size
    When user navigates to "Files" module
    Then user click size button and user should see folder view changed
  @SYMU-1174
  Scenario: User can change folder view order by Modified
    When user navigates to "Files" module
    Then user click modified button and user should see folder view changed
  @SYMU-1175
  Scenario: User can change the folder view by clicking the toggle-view button
    When user navigates to "Files" module
    Then user click toggle-view button and user should see folder view changed
  @SYMU-1176
  Scenario: User can select all the files at once and see the total values of all files
  in the first line when clicked on the “select all” checkbox
    When user navigates to "Files" module
    And user can select all files when clicked select all checkbox
    Then user can see the total values of all files