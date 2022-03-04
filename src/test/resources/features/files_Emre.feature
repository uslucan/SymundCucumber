Feature:User can change folder view order by Name

  Background:
    Given the user login with valid credentials
  @wip
  Scenario: user can change view by clicking name button
    When user navigates to "Files" module
    Then user click name button and user should see folder view changed
  @wip
  Scenario: User can change folder view order by Size
    When user navigates to "Files" module
    Then user click size button and user should see folder view changed
  @wip
  Scenario: User can change folder view order by Modified
    When user navigates to "Files" module
    Then user click modified button and user should see folder view changed