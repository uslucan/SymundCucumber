package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    }

    @When("the user click on the Add List… to create a new list of tasks")
    public void theUserClickOnTheAddListToCreateANewListOfTasks() {

        BrowserUtils.waitFor(2);
        tasksPage.addListElementLink.click();

    }

    @And("the user enters a new list task and create it with a checkmark icon")
    public void theUserEntersANewListTaskAndCreateItWithASaveButton() {
        tasksPage.newlistInputBox.sendKeys("BreakingBad");
        BrowserUtils.waitFor(2);
        tasksPage.checkMark.click();

    }
}