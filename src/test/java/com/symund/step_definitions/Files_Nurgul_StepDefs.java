package com.symund.step_definitions;

import com.github.dockerjava.api.command.RenameContainerCmd;
import com.symund.pages.FilesPage_Melek;
import com.symund.pages.FilesPage_Nurgul;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Files_Nurgul_StepDefs {

        FilesPage_Nurgul page = new FilesPage_Nurgul();



        @When("the user clicks the three-dot menu next to the {string}")
        public void the_user_clicks_the_three_dot_menu_next_to_the(String folderName) {
                page.clickThreeDot(folderName);
                BrowserUtils.waitFor(5);
        }

        @And("the user clicks on {string} button on three-dot menu")
        public void theUserClicksOnButtonOnThreeDotMenu(String actionName) {
                page.actions(actionName);
                BrowserUtils.waitFor(5);
        }


        @Then("user should see {string} folder in the Favorites feature")
        public void userShouldSeeFolderInTheFavoritesFeature(String folderName) {
                page.favoritesFeature.click();
                String actualFolderName= page.featureName(folderName).getAttribute("data-file");
                String expectedFolderName= "NYNewFolder";
                Assert.assertEquals(expectedFolderName,actualFolderName);
        }


        @Then("user should see {string} on the same folder")
        public void userShouldSeeOnTheSameFolder(String arg0) {

        }
}

