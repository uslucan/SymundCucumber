package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.When;

public class Files_Melek_stepDef {
    FilesPage_Melek page =  new FilesPage_Melek();

    @When("user clicks the plus dropdown icon")
    public void user_clicks_the_plus_dropdown_icon() {
        BrowserUtils.waitForPageToLoad(10);
        page.plusIcon.click();
    }

    @When("user clicks the upload button")
    public void user_clicks_the_upload_button() {
        page.uploadLink.click();
    }

}
