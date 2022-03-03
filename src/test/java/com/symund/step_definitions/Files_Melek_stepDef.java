package com.symund.step_definitions;

import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class Files_Melek_stepDef {
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
    public void userCanSeeInTheFileList(String expectedFileName) {
        String actualFileName= page.getFileName(expectedFileName);
        System.out.println("actualFileName = " + actualFileName);
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
        BrowserUtils.waitFor(4);
        page.confirmArrow.click();
        // delete folder at the end this method to create again. coming message that is this folder already exist message
    }









}
