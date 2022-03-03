package com.symund.step_definitions;

import com.symund.pages.DeletedFilesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeletedFilesDefs {

    @Given("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
    new DeletedFilesPage().navigateTo("files");
    }

    @Then("Click the Deleted Files module which is lower left corner")
    public void clickTheDeletedFilesModuleWhichIsLowerLeftCorner() {
            new DeletedFilesPage().DeletedFilesElm.click();
    }
}
