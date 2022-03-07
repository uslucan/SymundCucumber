Feature: Navigation feature

  Background:
    Given the user login with valid credentials

  @wip
  Scenario Outline: navigateTo <module>
    Then user navigates to "<module>" module
    Examples:
      | module |
      | files  |
      | photos |
      #| activity |
      #| talk     |
      #| mail     |
      #| contacts |
      #| circles  |
      #| calendar |
      #| notes    |
      #| deck     |
      #| tasks    |
