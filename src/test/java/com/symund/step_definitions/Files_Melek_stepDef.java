package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        String filePath="src\\test\\resources\\Sprint4_ Sample Folder";
        String fullPath= projectPath+"\\"+ filePath;
        System.out.println("fullPath = " + fullPath);

//
//        ((JavascriptExecutor)Driver.get()).executeScript(
//                "HTMLInputElement.prototype.click = function() {                     " +
//                        "  if(this.type !== 'file') HTMLElement.prototype.click.call(this);  " +
//                        "};                                                                  " );
//
//// trigger the upload
//       page.uploadLink.click();
//
//// assign the file to the `<input>`
//        Driver.get().findElement(By.cssSelector("input[type=file]"))
//                .sendKeys(fullPath);
//        BrowserUtils.waitFor(5);
//
//    //    page.uploadLink.sendKeys(fullPath);
//        BrowserUtils.waitFor(7);


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

}
