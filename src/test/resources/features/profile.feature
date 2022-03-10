Feature: User should be able to change profile info settings

  Background:
    Given the user login with valid credentials
    When the user clicks on the Avatar
    Then clicks on Settings
    When user lands on settings page

  Scenario: User can see the following titles
    Then the user is able to see the requested titles

  Scenario: User can change the the full name
    When the user clicks on "full name box"
    Then the user is able to change the name

  Scenario: User can change the privacy info for phone number
    When the user clicks on "private"
    Then user changes it to "private"

  Scenario: User can change the privacy info for phone number
    When the user clicks on "local"
    Then user changes it to "local"

  Scenario: User can change the privacy info for phone number
    When the user clicks on "federated"
    Then user changes it to "federated"

  Scenario: User can change the privacy info for phone number
    When the user clicks on "published"
    Then user changes it to "published"


  Scenario: User can see the current local time
    When the user scrolls down
    Then the user can see the local time