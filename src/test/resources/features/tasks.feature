
Feature: Tasks Functionality

  #As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.

  Background:
    When the user login with valid credentials

  Scenario:User can create a new list of tasks**

    Given the user navigates to "tasks" module
    Then the user see the "Add List…" with a plus icon
    When the user click on the Add List… to create a new list of tasks
    And the user enters a new list task and create it with a checkmark icon


