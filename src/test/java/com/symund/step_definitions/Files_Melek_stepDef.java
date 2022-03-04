package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Files_Melek_stepDef {
    FilesPage_Melek page =  new FilesPage_Melek();

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
        BrowserUtils.waitFor(3);
    }

    @Then("user can see {string} in the file list")
    public void userCanSeeInTheFileList(String expectedFileName) {
        String actualFileName= page.getFileName(expectedFileName);
        Assert.assertEquals(expectedFileName,actualFileName);
    }

    @When("user click New folder input box")
    public void user_click_New_folder_input_box() {

    }

    @When("user write the folder name and click confirm icon")
    public void user_write_the_folder_name_and_click_confirm_icon() {

    }

    @Then("user can see new created folder in file list")
    public void user_can_see_new_created_folder_in_file_list() {

    }




    @And("user write the folder name as SampleFolder{int} and click confirm icon")
    public void userWriteTheFolderNameAsSampleFolderAndClickConfirmIcon(int arg0) {
    }


}
