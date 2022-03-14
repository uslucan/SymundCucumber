package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user navigates to {string} module")
    public void the_user_navigates_to_module(String tasks) {
        dashboardPage.navigateTo(tasks);

    }
        @Then("the user see the {string} with a plus icon")
    public void theUserSeeTheWithAPlusIcon(String expectedButton) {
        Assert.assertEquals(expectedButton, tasksPage.addListElementLink.getText());
        BrowserUtils.waitFor(2);
    }

    @When("the user click on the Add List… to create a new list of tasks")
    public void theUserClickOnTheAddListToCreateANewListOfTasks() {
        tasksPage.addListElementLink.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user enters a {string} task and save it with a checkmark icon")
    public void theUserEntersATaskAndSaveItWithACheckmarkIcon(String newListTask) {
        tasksPage.addNewList(newListTask);
        tasksPage.checkMark.click();
        BrowserUtils.waitFor(2);

    }
    @And("the user click on the Book Lists to create a new task")
    public void theUserClickOnTheBookListsToCreateANewTask() {
        tasksPage.bookListElem.click();
        BrowserUtils.waitFor(2);
    }

    @And("the user can create a new task inside the Books Lists with an enter key")
    public void theUserCanCreateANewTaskInsideTheBooksListsWithAnEnterKey() {
        tasksPage.newTaskElement.click();
        tasksPage.newTaskElement.sendKeys("Fiction", Keys.ENTER);
        BrowserUtils.waitFor(3);
    }

    @And("the user click on the checkbox near the task name")
    public void theUserClickOnTheCheckboxNearTheTaskNameAs() {
          tasksPage.checkBox.click();
          BrowserUtils.waitFor(2);
    }

    @Then("the user can verify the task is added to the list of {string} by clicking")
    public void theUserCanVerifyTheTaskIsAddedToTheListOfByClicking(String expectedTitle) {
        BrowserUtils.waitFor(3);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals(expectedTitle,tasksPage.completedTask.getText());

    }

    @And("the user click on the star icon to add the task to the list of important task")
    public void theUserClickOnTheStarIconToAddTheTaskToTheListOfImportantTask() {
        tasksPage.starIcon.click();
        BrowserUtils.waitFor(2);

    }

    @Then("the user can verify the task is added to list of {string} task")
    public void theUserCanVerifyTheTaskIsAddedToListOfTask(String expectedTaskName) {
        System.out.println("expectedTaskName = " + expectedTaskName);
        Assert.assertEquals(expectedTaskName,tasksPage.importantTaskElem.getText());


    }

    @Then("the user see the {string} tab on the left side of the all lists")
    public void theUserSeeTheTabOnTheLeftSideOfTheAllLists(String expectedTabName) {
        System.out.println("expectedTabName = " + expectedTabName);
        BrowserUtils.waitFor(4);
        Assert.assertEquals(expectedTabName, tasksPage.currentTabElem.getText());
        BrowserUtils.waitFor(2);

    }
    @And("the user click on the Current tab")
        public void theUserClickOnTheCurrentTab() {
            tasksPage.tabName.click();
            BrowserUtils.waitFor(4);

    }

    @Then("the user can verify the {string} of uncompleted task next to Current tab")
    public void theUserCanVerifyTheOfUncompletedTaskNextToCurrentTab(String expectedNumber) {
        BrowserUtils.waitFor(3);
        System.out.println("expectedNumber = " + expectedNumber);
        Assert.assertEquals(expectedNumber,tasksPage.unCompletedTask.getText());

    }
}


