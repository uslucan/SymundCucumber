package com.symund.step_definitions;

import com.symund.pages.DeletedFilesPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class DeletedFilesDefs {

    @Given("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
    new DeletedFilesPage().navigateTo("files");
    }

    @Then("Click the Deleted Files module which is lower left corner")
    public void clickTheDeletedFilesModuleWhichIsLowerLeftCorner() {
            new DeletedFilesPage().DeletedFilesElm.click();
            BrowserUtils.waitFor(2);

    }

    @Given("Order the deleted files by newest to oldest")
    public void orderTheDeletedFilesByNewestToOldest(){
        BrowserUtils.waitFor(1);

        new DeletedFilesPage().triangleNewtoOld.click();

        }


    @Then("Verify that the user can see the most recent deleted file in the first line")
    public void verifyThatTheUserCanSeeTheMostRecentDeletedFileInTheFirstLine() {
        List<String> times = new ArrayList<>();
        List<Long> timesInt = new ArrayList<>();

        DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

        for (int i = 0; i <deletedFilesPage.timeStamps.size(); i++) {
            times.add(deletedFilesPage.timeStamps.get(i).getAttribute("data-timestamp"));
        }

        for (int i = 0; i < deletedFilesPage.timeStamps.size(); i++) {
           timesInt.add(Long.parseLong(times.get(i)));
        }

        for (int i = 0; i < timesInt.size()-1; i++) {
             if(timesInt.get(i)>timesInt.get(i+1)){
                 System.out.println("recent deleted file in the first line");
             }

        }

        System.out.println("timesInt = " + timesInt);

    }


    @Given("Click the triangle which is near the Deleted element on the right corner")
    public void clickTheTriangleWhichIsNearTheDeletedElementOnTheRightCorner() {
        new DeletedFilesPage().triangleNewtoOld.click();
        BrowserUtils.waitFor(1);

    }

    @Then("Verify that the user can order the all deleted files by newest to oldest or vice versa")
    public void verifyThatTheUserCanOrderTheAllDeletedFilesByNewestToOldestOrViceVersa() {
        new DeletedFilesPage().triangleOldToNew.click();
    }

    @Given("Click the Name element which is top of the deleted files")
    public void clickTheNameElementWhichIsTopOfTheDeletedFiles() {
        new DeletedFilesPage().nameElement.click();
    }

    @Then("Verify that the user can order alphabetically the all deleted files based on their names")
    public void verifyThatTheUserCanOrderAlphabeticallyTheAllDeletedFilesBasedOnTheirNames() {
        BrowserUtils.waitFor(1);
        new DeletedFilesPage().nameElement.click();
    }

    @Given("Click the … \\(three dot) element which is near the Restore button")
    public void clickTheThreeDotElementWhichIsNearTheRestoreButton() {
        new DeletedFilesPage().threeDot("Templates").click();
    }

    @And("Click Delete permanently element.")
    public void clickDeletePermanentlyElement() {
        new DeletedFilesPage().deleteIcon("Templates").click();

    }

    @Given("Click the Restore element which is near the …\\(three dot) element")
    public void clickTheRestoreElementWhichIsNearTheThreeDotElement() {
        new DeletedFilesPage().restoreIcon("Alperen").click();

    }

    @And("Navigate to All Files page by clicking the All Files which is top left corner of the Deleted files page")
    public void navigateToAllFilesPageByClickingTheAllFilesWhichIsTopLeftCornerOfTheDeletedFilesPage() {
        new DeletedFilesPage().allFilesElement.click();

    }

    @Then("Verify that the user can see the restored file.")
    public void verifyThatTheUserCanSeeTheRestoredFile() {
        new DeletedFilesPage().restoredFile("Alperen").click();
    }
}
