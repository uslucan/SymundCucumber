package com.symund.step_definitions;

import com.symund.pages.FilesPage_Melek;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Files_Emre_StepDefs {


    @Then("user click name button and user should see folder view changed")
    public void user_click_name_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().nameList);
        new FilesPage_Melek().NameBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().nameList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }

    @Then("user click size button and user should see folder view changed")
    public void user_click_size_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().sizeList);
        new FilesPage_Melek().sizeBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().sizeList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }
    @Then("user click modified button and user should see folder view changed")
    public void user_click_modified_button_and_user_should_see_folder_view_changed() {
        List<String> beforeClick = BrowserUtils.getElementsText(new FilesPage_Melek().modifiedList);
        new FilesPage_Melek().modifiedBtn.click();
        List<String> afterClick = BrowserUtils.getElementsText(new FilesPage_Melek().modifiedList);
        Assert.assertNotEquals(beforeClick,afterClick);
    }


}
