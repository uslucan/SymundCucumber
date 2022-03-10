Feature: Tasks Functionality

  #As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.

  Background:
    Given the user login with valid credentials


  Scenario:User can create a new list of tasks**
    When the user navigates to "tasks" module
    Then the user see the "Add List…" with a plus icon
    When the user click on the Add List… to create a new list of tasks


  Scenario:User can create a new task
    When the user navigates to "tasks" module
    When the user click on the Add List… to create a new list of tasks
    And the user enters a "Book Lists" task and save it with a checkmark icon
    And the user click on the Book Lists to create a new task
    And the user can create a new task inside the Books Lists with an enter key


  Scenario: User can add any task to the list of completed tasks by clicking on the checkbox near the task name

    When the user navigates to "tasks" module
    And the user click on the Book Lists to create a new task
    And  the user click on the checkbox near the task name
    Then the user can verify the task is added to the list of "1 Completed Task" by clicking


  Scenario: User can add any task to the list of important tasks by clicking on the star icon on the right side of task line

    When the user navigates to "tasks" module
    And the user click on the Book Lists to create a new task
    And the user can create a new task inside the Books Lists with an enter key
    And the user click on the star icon to add the task to the list of important task
    Then the user can verify the task is added to list of "Important" task


  Scenario: User can see the number of all uncompleted tasks next to the Current tab

    When the user navigates to "tasks" module
    Then the user see the "Current" tab on the left side of the all lists
    And the user click on the Current tab
    Then the user can verify the "22" of uncompleted task next to Current tab
