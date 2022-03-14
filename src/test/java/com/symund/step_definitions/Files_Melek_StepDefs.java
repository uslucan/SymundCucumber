package com.symund.step_definitions;

import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Files_Melek_StepDefs {

    FilesPage page =  new FilesPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    String fakeFolderName= page.createFakeFolderName();
    String willBeDeleted= page.createFakeFolderName();
    String getFakeFolderName= page.createFakeFolderName();

    @When("user click the plus dropdown icon")
    public void user_click_the_plus_dropdown_icon() {
        BrowserUtils.waitForPageToLoad(10);
        page.NameBtn.click();
        page.plusIcon.click();
    }

    @And("user can upload file")
    public void userCanUploadFile() {
        String projectPath= System.getProperty("user.dir");
        String filePath="src\\test\\resources\\Sprint4_SampleFile.txt";
        String fullPath= projectPath+"\\"+ filePath;
        page.uploadFile.sendKeys(fullPath);
    }

    @Then("user can see {string} in the file list")
    public void userCanSeeInTheFileList(String fileName) {
        String actualFileName= page.getFileName(fileName);
        Assert.assertEquals(fileName,actualFileName);
        BrowserUtils.waitFor(2);
        page.deleteFolderToReuse(fileName);
    }

    @When("user click New folder input box")
    public void user_click_New_folder_input_box() {
        page.newFolder.click();
    }

    @And("user write the folder name and click confirm icon")
    public void userWriteTheFolderNameAndClickConfirmIcon() {
        BrowserUtils.waitForVisibility(page.newFolderInputBox,10);
        page.newFolderInputBox.sendKeys(fakeFolderName);
        page.confirmArrow.click();
    }

    @Then("user can see folder in the file list")
    public void userCanSeeFolderInTheFileList() {
        String actualFileName= page.getFileName(fakeFolderName);
        Assert.assertEquals(fakeFolderName,actualFileName);
    }

    @When("the user clicks the three dot menu next to the {string}")
    public void theUserClicksTheThreeDotMenuNextToThe(String folderName) {
        BrowserUtils.waitFor(2);
        page.clickThreeDot(folderName);
    }

    @And("click {string} button")
    public void clickButton(String actionName) {
        BrowserUtils.waitFor(2);
        page.actions(actionName);
    }

    @When("user choose {string} as target folder")
    public void userChooseAsTargetFolder(String folderName) {
        BrowserUtils.waitFor(2);
        page.clickTargetFolder(folderName);
    }

    @And("click Move to button that has fileName")
    public void clickMoveToButtonThatHasFileName() {
        BrowserUtils.waitForClickablility(page.moveToButton,5);
        page.moveToButton.click();
    }

    @When("user click {string} on Files main page")
    public void userClickOnFilesMainPage(String targetFolderName) {
        BrowserUtils.waitForClickablility(By.xpath("//tr[@data-file='"+targetFolderName+"']"),5);
        page.folderInFileList(targetFolderName);
        BrowserUtils.waitFor(3);
    }

    @When("after a folder is selected")
    public void afterAFolderIsSelected() {
        page.creatNewFolder();
        BrowserUtils.waitForVisibility(page.newFolderInputBox,10);
        page.newFolderInputBox.sendKeys(getFakeFolderName);
        page.confirmArrow.click();
    }

    @When("the user clicks the three dot menu next to the folder name")
    public void theUserClicksTheThreeDotMenuNextToTheFolderName() {
        page.NameBtn.click();
        BrowserUtils.waitFor(2);
        page.clickThreeDot(getFakeFolderName);
        BrowserUtils.waitFor(2);
    }

    @Then("user should see moved folder in MSTargetFolder")
    public void userShouldSeeMovedFolderInMSTargetFolder() {
        String actualFolderName= page.getFileName(getFakeFolderName);
        Assert.assertEquals(getFakeFolderName,actualFolderName);
    }

    @When("select a folder")
    public void selectAFolder() {
        page.creatNewFolder();
        page.newFolderInputBox.sendKeys(willBeDeleted);
        page.confirmArrow.click();
    }

    @When("the user clicks the three dot menu next to the new created folder and click {string} button")
    public void theUserClicksTheThreeDotMenuNextToTheNewCreatedFolderAndClickButton(String deletedFolder) {
        jse.executeScript("window.scrollBy(0,250)", "");
        BrowserUtils.waitFor(2);
        page.clickThreeDot(willBeDeleted);
        BrowserUtils.waitFor(2);
        page.actions("Delete folder");
    }

    @When("User click Deleted files on the left bottom of page")
    public void userClickDeletedFilesOnTheLeftBottomOfPage() {
        page.deletedFiles.click();
    }

    @Then("user should see deleted folder in list")
    public void userShouldSeeDeletedFolderInList() {
        page.sortedByDeleted.click();
        String actualFileName= page.getFolderName(willBeDeleted);
        Assert.assertEquals(willBeDeleted,actualFileName);
    }

    @When("user roll down list table bottom of the Files page")
    public void user_roll_down_list_table_bottom_of_the_Files_page() {
        jse.executeScript("arguments[0].scrollIntoView();", page.numOfFolders);
    }

    @Then("user should see total number of folders and files")
    public void user_should_see_total_number_of_folders_and_files() {
       Assert.assertEquals(page.sumOfFolderInList(),page.sumOfFoldersBottomOfPage());
       Assert.assertEquals(page.sumOfFilesInList(),page.sumOfFilesBottomOfPage());
    }


}
