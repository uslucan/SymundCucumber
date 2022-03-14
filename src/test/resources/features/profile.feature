@wip
Feature: User should be able to change profile info settings

  Background:
    Given the user login with valid credentials
    When the user clicks on the Avatar
    Then clicks on Settings
    When user lands on settings page

  @SYMU-1219
  Scenario: User can see the following titles
    Then the user is able to see the requested titles

  @SYMU-1220
  Scenario: User can change the the full name
    When the user clicks on "full name box"
    Then the user is able to change the name

  @SYMU-1221
  Scenario: User can change the privacy info for phone number as private
    When the user clicks on "private"
    Then user changes it to "private"

  @SYMU-1222
  Scenario: User can change the privacy info for phone number as local
    When the user clicks on "local"
    Then user changes it to "local"

  @SYMU-1223
  Scenario: User can change the privacy info for phone number as federated
    When the user clicks on "federated"
    Then user changes it to "federated"

  @SYMU-1224
  Scenario: User can change the privacy info for phone number as published
    When the user clicks on "published"
    Then user changes it to "published"

  @SYMU-1225
  Scenario: User can see the current local time
    Then the user can see the local time