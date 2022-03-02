package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class Files_Melek_stepDef {
    FilesPage_Melek page =  new FilesPage_Melek();

    @When("user click the plus dropdown icon")
    public void user_click_the_plus_dropdown_icon() {
        BrowserUtils.waitForPageToLoad(10);
        page.plusIcon.click();
    }

    @When("user click the upload button")
    public void user_click_the_upload_button() {

//        String projectPath= System.getProperty("user.dir");
//        System.out.println("projectPath = " + projectPath);
//        String filePath="target"+"\\"+"Melek_Sprint4_file.txt";
//        String fullPath= projectPath+"\\"+ filePath;
//        System.out.println("fullPath = " + fullPath);
//        page.uploadLink.sendKeys(fullPath);
        page.uploadLink.click();


        BrowserUtils.waitFor(5);
    }

}
