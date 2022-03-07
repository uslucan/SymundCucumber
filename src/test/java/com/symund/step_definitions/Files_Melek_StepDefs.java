package com.symund.step_definitions;

import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class Files_Melek_StepDefs {

    FilesPage page =  new FilesPage();

    @When("user click the plus dropdown icon")
    public void user_click_the_plus_dropdown_icon() {
        BrowserUtils.waitForPageToLoad(10);
        page.plusIcon.click();
    }

    @Then("user can upload file")
    public void user_can_upload_file() {
        String projectPath= System.getProperty("user.dir");
        System.out.println("projectPath = " + projectPath);
        String filePath="src\\test\\resources\\Sprint4_SampleFile.txt";
        String fullPath= projectPath+"\\"+ filePath;
        System.out.println("fullPath = " + fullPath);
        page.uploadFile.sendKeys(fullPath);
    }

    @Then("user can see {string} in the file list")
    public void userCanSeeInTheFileList(String fileName) {
        String actualFileName= page.getFileName(fileName);
        String expectedFileName= "Sprint4_SampleFile.txt";
        Assert.assertEquals(expectedFileName,actualFileName);

    }

    @When("user click New folder input box")
    public void user_click_New_folder_input_box() {
        page.newFolder.click();
    }

    @And("user write the folder name as {string} and click confirm icon")
    public void userWriteTheFolderNameAsAndClickConfirmIcon(String name) {
        BrowserUtils.waitForVisibility(page.newFolderInputBox,5);
        page.newFolderInputBox.sendKeys(name);
        page.confirmArrow.click();
        // delete folder at the end this method to create again. coming message that is this folder already exist message
    }

    @When("the user clicks the three dot menu next to the {string}")
    public void theUserClicksTheThreeDotMenuNextToThe(String folderName) {
        page.clickThreeDot(folderName);
        BrowserUtils.waitFor(5);
    }

    @And("click {string} button")
    public void clickButton(String actionName) {
        page.actions(actionName);
    }

    @When("user choose {string} as target folder")
    public void userChooseAsTargetFolder(String folderName) {
        page.clickTargetFolder(folderName);
    }

    @And("click Move to button that has fileName")
    public void clickMoveToButtonThatHasFileName() {
        page.moveToButton.click();
    }

    @When("user click {string} on Files main page")
    public void userClickOnFilesMainPage(String targetFolderName) {
        page.folderInFileList(targetFolderName);
    }

    @Then("user should see {string} in MSTargetFolder")
    public void userShouldSeeInMSTargetFolder(String sourceFolder) {
        String expectedFolderName= "MSSourceFolder";
        String actualFolderName= page.getFileName(sourceFolder);
        Assert.assertEquals(expectedFolderName,actualFolderName);
    }


    @When("User click Deleted files on the left bottom of page")
    public void userClickDeletedFilesOnTheLeftBottomOfPage() {
        page.deletedFiles.click();
        BrowserUtils.waitFor(5);
    }

    @Then("user should see deleted {string} in list")
    public void userShouldSeeDeletedInList(String folderName) {
        String actualName=page.getFileName(folderName);
        Assert.assertEquals(folderName,actualName);

    }
}
