package com.symund.step_definitions;

import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Files_Emre_StepDefs {


    @Then("user click name button and user should see folder view changed")
    public void user_click_name_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().nameList);
        new FilesPage().NameBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().nameList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }

    @Then("user click size button and user should see folder view changed")
    public void user_click_size_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().sizeList);
        new FilesPage().sizeBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().sizeList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click modified button and user should see folder view changed")
    public void user_click_modified_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage().modifiedList);
        new FilesPage().modifiedBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage().modifiedList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }


}
